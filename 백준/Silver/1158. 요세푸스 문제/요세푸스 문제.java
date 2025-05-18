import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        StringBuilder result = new StringBuilder();
        Queue<Integer> queue = new LinkedList<>();
        
        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }

        int count = 1;
        result.append("<");
        while (queue.size() != 0) {

            if (count == K) {
                result.append(queue.poll() + ", ");
                count = 1;
                continue;
            }
            ++count;
            queue.add(queue.poll());
        }
        result.append(">");
        result.deleteCharAt(result.length() - 3);
        result.deleteCharAt(result.length() - 2);
        System.out.println(result);

    }
}