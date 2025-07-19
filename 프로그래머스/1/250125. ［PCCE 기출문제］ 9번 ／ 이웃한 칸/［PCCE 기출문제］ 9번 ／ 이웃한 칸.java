import java.util.*;

class Solution {
    static int[] dh= {-1, 1, 0, 0};
    static int[] dw= {0, 0, -1, 1};
    
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        int r = board.length;
        int c = board[0].length;
        
        for(int i=0;i<4;i++) {
            int next_h= h + dh[i];
            int next_w= w + dw[i];
            if(next_h < 0 || next_h >= r || next_w < 0 || next_w >= c) 
                continue;
            if(board[h][w].equals(board[next_h][next_w])) {
                answer ++;
            }
        }
        return answer;
    }
}
 