import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] basket = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            basket[i] = i;
        }
        for (int x = 0; x < m; x++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            for (int y = 0; y < (j - i) / 2 + 1; y++) {
                int tmp = basket[i + y];
                basket[i + y] = basket[j - y];
                basket[j - y] = tmp;
            }
        }
        for (int i = 1; i <= n; i++) {
            System.out.print(basket[i] + " ");
        }

        sc.close();
    }
}