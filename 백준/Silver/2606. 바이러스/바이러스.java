import java.io.*;
import java.util.*;

public class Main {
    static int[][] graph;
    static boolean[] visited;
    static int n,m, answer = 0;


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());
        m = Integer.parseInt(br.readLine());
        graph = new int[n + 1][n + 1]; // 0부터 시작이 아닌 1부터 시작이기 때문 n + 1
        visited = new boolean[n + 1];
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            graph[u][v] = graph[v][u] = 1; // 양방향간선
        }

        bfs();
        System.out.println(answer);


    }
    static void bfs() {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1); // 1부터 시작
        visited[1] = true; // 방문한 곳은 true
        while (!queue.isEmpty()) {
            int tmp = queue.poll();
            for (int i = 1; i <= n; i++) {
                if (graph[tmp][i] == 1 && !visited[i]) { // 현재번호와 연결된곳이면서 방문하지 않은 장소
                    queue.offer(i);
                    visited[i] = true;
                    answer ++;
                }
            }
        }
    }
}