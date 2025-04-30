import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int order = Integer.parseInt(st.nextToken());
            if (order == 1) {
                int num = Integer.parseInt(st.nextToken());
                stack.push(num);
            } else if (order == 2) {
                int pop = -1;
                if (!stack.isEmpty()) {
                    pop = stack.pop();
                }
                System.out.println(pop);
            } else if (order == 3) {
                System.out.println(stack.size());
            } else if (order == 4) {
                if (stack.isEmpty()) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
            } else if (order == 5) {
                if (!stack.isEmpty()) {
                    int pop = stack.pop();
                    System.out.println(pop);
                    stack.push(pop);
                } else {
                    System.out.println(-1);
                }
            }
        }
    }
}