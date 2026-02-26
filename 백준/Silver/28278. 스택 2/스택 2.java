import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> s = new Stack<>();
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            switch(Integer.parseInt(st.nextToken())) {

                case 1:
                    s.push(Integer.parseInt(st.nextToken()));
                    break;

                case 2:
                    if (!s.empty())
                        System.out.println(s.pop());
                    else
                        System.out.println(-1);
                    break;

                case 3:
                    System.out.println(s.size());
                    break;

                case 4:
                    if (s.empty())
                        System.out.println(1);
                    else
                        System.out.println(0);
                    break;

                case 5:
                    if (!s.empty())
                        System.out.println(s.peek());
                    else
                        System.out.println(-1);
                    break;

                default:
                    break;
            }
        }
    }
}