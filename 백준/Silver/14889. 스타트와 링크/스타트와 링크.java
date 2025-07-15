import java.util.*;

public class Main {
    static int[][] board;
    static int target;
    static int N;
    static int answer = Integer.MAX_VALUE;
    static boolean[] visited;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        target = N / 2;
        int target = N / 2;
        board = new int[N][N];
        visited = new boolean[N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                board[i][j] = in.nextInt();
            }
        }
        dfs(0, 0);
        System.out.print(answer);
    }

    public static void dfs(int index, int depth) {
        if (target == depth) {
            calculate();
            return;
        } else {
            for (int i = index; i < N; i++) {
                if (!visited[i]) {
                    visited[i] = true;
                    dfs(i + 1, depth + 1);
                    visited[i] = false;
                }
            }
        }
    }

    public static void calculate() {
        int startTeamCount = 0;
        int linkTeamCount = 0;

        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N; j++) {
                if (visited[i] && visited[j]) {
                    startTeamCount += board[i][j];
                    startTeamCount += board[j][i];
                } else if (!visited[i] && !visited[j]) {
                    linkTeamCount += board[i][j];
                    linkTeamCount += board[j][i];
                }
            }
        }

        int dif = Math.abs(startTeamCount - linkTeamCount);
        if (dif == 0) {
            System.out.print(dif);
            System.exit(0);
        }
        answer = Math.min(answer, dif);
    }
}