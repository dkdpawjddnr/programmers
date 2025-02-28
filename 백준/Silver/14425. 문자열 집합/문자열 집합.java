import java.io.*;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] num = bf.readLine().split(" ");
        int n = Integer.parseInt(num[0]);
        int m = Integer.parseInt(num[1]);

        HashMap<String, Integer> arrn = new HashMap<>();
        for (int i = 0; i < n; i++) {
                arrn.put(bf.readLine(), i);
        }


        String[] arrm = new String[m];

        for (int i = 0; i < m; i++) {
                arrm[i] = bf.readLine();
        }

        int a = 0;
        for (int i = 0; i < m; i++) {
            if (arrn.containsKey(arrm[i])) {
                a += 1;
            }else {
                a += 0;
            }
        }
        bw.write(a + "");

        bw.flush();
        bw.close();
    }
}