import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N  = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        while(N-- > 0){
            queue.offer(Integer.parseInt(st.nextToken()));
        }
        String result = "Sad";
        int currentNum = 1;
        while(true){
            if(queue.isEmpty() && !stack.isEmpty() && stack.peek() != currentNum){
                break;
            }
            if(stack.isEmpty() && queue.isEmpty()){
                result = "Nice";
                break;
            }
            if(!queue.isEmpty() && queue.peek() == currentNum){
                queue.poll();
                currentNum += 1;
                continue;
            }
            if(!stack.isEmpty() &&stack.peek() == currentNum){
                stack.pop();
                currentNum += 1;
                continue;
            }
            if(!queue.isEmpty() && queue.peek() != currentNum){
                stack.push(queue.poll());
            }
        }
        System.out.println(result);
    }
}