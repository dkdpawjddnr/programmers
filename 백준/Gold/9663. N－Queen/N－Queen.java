import java.io.*;

public class Main {

    static int N;
    static long total = 0;
    static boolean[] col;
    static boolean[] diag1;
    static boolean[] diag2;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        col = new boolean[N];
        diag1 = new boolean[2 * N];
        diag2 = new boolean[2 * N];

        func(0);
        System.out.print(total);
    }

    public static void func(int y) {
        if (y == N) {
            total++;
            return;
        }

        for (int x = 0; x < N; x++) {
            if (isNotSafe(x, y)) continue;
            col[x] = diag1[x + y] = diag2[x - y + (N - 1)] = true;
            func(y + 1);
            col[x] = diag1[x + y] = diag2[x - y + (N - 1)] = false;
        }
    }

    public static boolean isNotSafe(int x, int y) {
        return col[x] || diag1[x + y] || diag2[x - y + (N - 1)];
    }
}
