import java.util.HashSet;

public class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int allowedNum = nums.length/2; 

        HashSet<Integer> set = new HashSet<>();

        for (int x : nums) {    
            set.add(x); 
        }
        int max = set.size();

        if (max > allowedNum)
            max = allowedNum;

        answer = max;
        return answer;
    }
}