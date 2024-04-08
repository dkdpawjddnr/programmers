import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.close();

        for(int i=0; i<n; i++){
            for(int j=n; j>i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
