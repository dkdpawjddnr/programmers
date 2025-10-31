import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int maxTemperature = -10000000;

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] list = new int[N];
        int[] sum = new int[N - K + 1];
        int count = 1;

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            list[i] = num;

            if (i >= K) {
                sum[count] = (num + sum[count - 1] - list[count - 1]);
                count++;
            } else {
                sum[0] += num;
            }
        }


        for (int i = 0; i < N - K + 1; i++) {
            if (sum[i] > maxTemperature) {
                maxTemperature = sum[i];
            }
        }

        System.out.println(maxTemperature);
    }
}