import java.util.*;
import java.io.*;

public class Main{
    static int[] num;

    static int N;
    static int min = Integer.MAX_VALUE;
    static int max = Integer.MIN_VALUE;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        num = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i<N; i++)
            num[i] = Integer.parseInt(st.nextToken());

        int[] calc = new int[4];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<4; i++)
            calc[i] = Integer.parseInt(st.nextToken());

        dfs(num[0], 0, calc);

        System.out.println(max+"\n"+min);
    }

    static void dfs(int sum, int cnt, int[] calc){
        if(cnt == N - 1){
            min = Math.min(min, sum);
            max = Math.max(max, sum);
            return;
        }

        for(int i = 0; i<4; i++){
            if(calc[i] == 0)
                continue;

            int nextSum = sum;

            switch(i){
                case 0:
                    nextSum += num[cnt+1];
                    break;
                case 1:
                    nextSum -= num[cnt+1];
                    break;
                case 2:
                    nextSum *= num[cnt+1];
                    break;
                case 3:
                    nextSum /= num[cnt+1];
                    break;
            }

            calc[i]--;
            dfs(nextSum, cnt+1, calc);
            calc[i]++;
        }
    }
}