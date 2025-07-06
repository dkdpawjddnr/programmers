import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Queue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<n; i++){
            int x = Integer.parseInt(br.readLine());
            if (x > 0){
                heap.add(x);
            } else if (x == 0){
                Integer polled = heap.poll();
                if(polled == null){
                    sb.append(0 + "\n");
                }else
                    sb.append(polled + "\n");
            }
        }
        System.out.println(sb);
    }
}