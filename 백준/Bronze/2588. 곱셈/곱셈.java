import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        System.out.println(number1 * (number2 % 10));
        System.out.println(number1 * (number2 % 100 / 10));
        System.out.println(number1 * (number2 / 100));
        System.out.println(number1 * number2);
    }
}
