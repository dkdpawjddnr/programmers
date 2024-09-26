import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // 입력이 더 이상 없을 때까지 계속 반복
        while (in.hasNext()) {
            // 두 정수를 입력받음
            int a = in.nextInt();
            int b = in.nextInt();

            // 두 정수의 합을 출력
            System.out.println(a + b);
        }

        // Scanner를 닫음
        in.close();
    }
}