import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // A = 영수증 총 금액
        int A = scanner.nextInt();
        // B = 물건의 종류 수
        int B = scanner.nextInt();
        int sum = 0;

        for (int i = 0; i < B; i++) {
            // a = 물건의 가격
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            sum += a * b;
        }
        if (sum == A) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
