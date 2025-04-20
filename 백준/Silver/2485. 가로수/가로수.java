import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int distance = 0;

        List<Integer> list =new ArrayList<>();

        for(int i = 0; i < N; i++ ){
            list.add(Integer.parseInt(br.readLine()));	
        }
        Collections.sort(list);			

        for(int i = 1; i < N; i++){
            int d = list.get(i) - list.get(i-1);		
            distance = gcd(d, distance);			
        }

        System.out.println( ((list.get(N-1) - list.get(0))/distance) -N+1  );

    }

    public static int gcd(int x, int y){
        if(y == 0){
            return x;
        } else {
            return gcd(y, x%y);
        }
    }
}