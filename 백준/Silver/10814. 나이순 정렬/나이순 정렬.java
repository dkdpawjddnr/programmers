import java.io.*;
import java.util.*;
 
public class Main {
    static int N;
    static Queue<String>[] members;
 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
 
        N = Integer.parseInt(br.readLine());
        members = new LinkedList[201];
        for (int i = 1; i <= 200; i++)
            members[i] = new LinkedList<>();
 
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            st = new StringTokenizer(str);
            int age = Integer.parseInt(st.nextToken());
            members[age].offer(str);
        }
 
        for (int i = 1; i <= 200; i++) {
         while(!members[i].isEmpty())
             bw.write(members[i].poll() + "\n");
        }
        br.close();
        bw.close();
    }
}