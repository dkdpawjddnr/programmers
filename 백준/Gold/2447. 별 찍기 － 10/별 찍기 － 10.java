import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        String[][] stars = new String[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                stars[i][j] = "*";
            }
        }

        recursive(N, stars, 0, 0);
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                sb.append(stars[i][j]);
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }

    private static void recursive(int N, String[][] stars, int r, int c) {
        if (N == 1) return; 

        int newN = N / 3;

        for (int i = r + newN; i < r + 2 * newN; i++) {
            for (int j = c + newN; j < c + 2 * newN; j++) {
                stars[i][j] = " ";
            }
        }

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                recursive(newN, stars, r + row * newN, c + col * newN);
            }
        }
    }
}