import java.util.*;

class Solution {
    public int[] solution(String[] park, String[] routes) {
        int m = park.length;
        int n = park[0].length();
        int curX = 0;
        int curY = 0;

        char[][] grid = new char[m][n];


        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = park[i].charAt(j);
                if (grid[i][j] == 'S') {
                    curX = i;
                    curY = j;
                }
            }
        }


        int[] dx = { -1, 1, 0, 0 };
        int[] dy = { 0, 0, -1, 1 };
        
        // 이동 방향을 문자에서 숫자로 매핑하는 맵을 생성합니다.
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('N', 0);
        map.put('S', 1);
        map.put('W', 2);
        map.put('E', 3);

        // 주어진 이동 명령에 따라 이동합니다.
        for (String command : routes) {
            // 이동 방향과 거리를 추출합니다.
            char op = command.charAt(0);
            int move = command.charAt(2) - '0';

            // 이동 후 위치를 계산합니다.
            int nextX = curX;
            int nextY = curY;
            boolean isOK = true;
            for (int i = 0; i < move; i++) {
                nextX += dx[map.get(op)];
                nextY += dy[map.get(op)];

                // 이동한 위치가 주차장을 벗어나거나 장애물에 막혔는지 확인합니다.
                if (nextX < 0 || nextY < 0 || nextX >= m || nextY >= n || grid[nextX][nextY] == 'X') {
                    isOK = false;
                    break;
                }
            }

            // 이동이 가능하다면 현재 위치를 업데이트합니다.
            if (isOK) {
                curX = nextX;
                curY = nextY;
            }
        }

        // 최종 위치를 반환합니다.
        return new int[] { curX, curY };
    }
}