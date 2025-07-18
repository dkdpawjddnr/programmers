import java.util.Arrays;

class Solution {
    public int solution(int[][] targets) {

        Arrays.sort(targets, (a,b) -> Integer.compare(a[1], b[1]));
        int count = 0;
        int min = 0;

        for(int i = 0; i < targets.length;i++) {
            if(targets[i][0] >= min) {
                count++;
                min = targets[i][1];
            }
        }

        return count;
    }
}