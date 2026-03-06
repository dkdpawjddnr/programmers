import java.util.*;
class Solution {
    public int solution(int n, int w, int num) {
        int answer = 0;
        int[][] map = new int[n%w == 0 ? n/w : n/w+1][w];
        int a = 1;
        
        boolean flag = true;
        
        loop:
        for(int i=map.length-1; i>=0; i--) {
            if(flag) {
                for(int j=0; j<map[i].length; j++) {
                    if(a > n) break loop;
                    map[i][j] = a++;
                }
            } else {
                for(int j=map[i].length-1; j>=0; j--) {
                    if(a > n) break loop;
                    map[i][j] = a++;
                }
            }
            flag = !flag;
        }
        
        loop:
        for(int i=0; i<map.length; i++) {
            for(int j=0; j<map[i].length; j++) {
                if(map[i][j] == num) {
                    answer = i+1;
                    if(map[0][j]==0) answer--;
                    break loop;
                }
            }
        }
        
        return answer;
    }
}