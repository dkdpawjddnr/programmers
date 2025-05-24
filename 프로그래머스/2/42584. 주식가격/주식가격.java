import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        int length = prices.length;
        int[] answer = new int[length];
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < length; i++) {
            queue.offer(i);
        }

        while (!queue.isEmpty()) {
            int i = queue.poll();
            int count = 0;
            for (int j = i + 1; j < length; j++) {
                count++;
                if (prices[j] < prices[i]) {
                    break;
                }
            }
            answer[i] = count;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] prices = {1, 2, 3, 2, 3};
        int[] result = sol.solution(prices);
        System.out.println(Arrays.toString(result)); 
    }
}
