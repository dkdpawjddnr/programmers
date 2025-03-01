import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashMap<String, String> nameToNum = new HashMap<>();
        HashMap<String, String> numToName = new HashMap<>();

        for (int i = 1; i <= n; i++) {
            String s = br.readLine();
            String num = String.valueOf(i);
            numToName.put(num, s);
            nameToNum.put(s, num);
        }

        for (int i = 0; i < m; i++) {
            String query = br.readLine();

            if (query.matches("\\d+")) {
                System.out.println(numToName.get(query));
            } else {
                System.out.println(nameToNum.get(query));
            }
        }
    }
}