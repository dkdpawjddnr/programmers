import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
   
        Map<String, Integer> playerMap = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            playerMap.put(players[i], i);
        }
        
        for (String calling : callings) {
            int index = playerMap.get(calling);
            if (index > 0) {
                String temp = players[index];
                players[index] = players[index - 1];
                players[index - 1] = temp;
                
                playerMap.put(players[index], index);
                playerMap.put(players[index - 1], index - 1);
            }
        }
        return players;
    }
}

