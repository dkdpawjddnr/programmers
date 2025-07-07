import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static int M;
    static ArrayList<Integer> answer;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        N = Integer.parseInt(input[0]);
        M = Integer.parseInt(input[1]);
        answer = new ArrayList<Integer>();

        backTrackingFunction(1, 0);

    }

    static void backTrackingFunction(int start, int depth){
        if(depth == M){
            for(int i=0; i<depth; i++){
                System.out.print(answer.get(i) + " ");
            }
            System.out.println();
            return;
        }

        for(int i=start; i<N+1; i++){
            answer.add(i);
            backTrackingFunction(i + 1, depth + 1);
            answer.remove(answer.size() - 1);

        }
    }

}

