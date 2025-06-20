import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;

        HashSet<String> set = new HashSet<>();
        String user1, user2;
        set.add("ChongChong");

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            user1 = st.nextToken();
            user2 = st.nextToken();

            if (set.contains(user1) || set.contains(user2)) {
                set.add(user1);
                set.add(user2);
            }
        }
        System.out.println(set.size());
    }
}