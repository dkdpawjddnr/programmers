import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int [] arr = new int[N];
        int M = scanner.nextInt();

        for (int i = 0 ; i < M; i++){
            int I = scanner.nextInt();
            int J = scanner.nextInt();
            int K = scanner.nextInt();

            for (int j = I - 1; j < J; j++){
                arr[j] = K;
            }
        }
        for (int k = 0; k < arr.length; k++){
            System.out.print(arr[k] + " ");
        }
        scanner.close();
    }
}
