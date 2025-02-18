import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[][] arr = new int[N][2];

        for(int i = 0; i < N; i++){
            arr[i][0] = scan.nextInt();
            arr[i][1] = scan.nextInt();
        }
        Arrays.sort(arr , (a,b)->{
            if(a[0] == b[0]) {
                return Integer.compare(a[1], b[1]);
            } else{
                return Integer.compare(a[0],b[0]);
            }
        });

        for(int j = 0; j < N; j++){
            System.out.println(arr[j][0]+ " " + arr[j][1]);
        }
    }
}