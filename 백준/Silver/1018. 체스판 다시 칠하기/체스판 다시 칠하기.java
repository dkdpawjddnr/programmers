import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N, M = 0;
    static char[][] arr;
    static int min = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new char[N][M];

        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < M; j++) {
                arr[i][j] = line.charAt(j);
            }
        }

        for (int i = 0; i < N - 7; i++) {
            for (int j = 0; j < M - 7; j++) {
                min = Math.min(min, getCount(i, j));
            }
        }
        System.out.println(min);
    }

    static int getCount(int x, int y) {
        int countX = 0;
        int countY = 0;

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                char cur = arr[x + i][y + j];

                if ((i + j) % 2 == 0) {
                    if (cur != 'W') countX++;
                    if (cur != 'B') countY++;
                } else {
                    if (cur != 'B') countX++;
                    if (cur != 'W') countY++;
                }
            }
        }

        return Math.min(countX, countY);
    }
}