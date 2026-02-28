import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int max = -1000000;
        int min = 1000000;
        int num;
        
        for (int i = 0; i < N; i++) {
            num = Integer.parseInt(st.nextToken());
            if (max < num)
                max = num;
            if (min > num)
                min = num;

        }
        sb.append(min).append(" ").append(max);
        System.out.println(sb);
    }
}
