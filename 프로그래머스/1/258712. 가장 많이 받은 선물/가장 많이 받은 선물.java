import java.util.*;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        int answer = 0;
        Map<String, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < friends.length; i++) {
            indexMap.put(friends[i], i);
        }

        int[][] giftArray = new int[friends.length][friends.length];
        int[] giftNum = new int[friends.length];
        for (String gift : gifts) {
            String[] giftSplit = gift.split(" ");
            int giveIndex = indexMap.get(giftSplit[0]);
            int receiveIndex = indexMap.get(giftSplit[1]);
            giftNum[giveIndex]++;
            giftNum[receiveIndex]--;
            giftArray[giveIndex][receiveIndex]++;
        }

        int nowGift[] = new int[friends.length];
        for (int i = 0; i < friends.length; i++) {

            for (int j = 0; j < friends.length; j++) {
                if (i == j) continue;
                if (giftArray[i][j] > giftArray[j][i]) {
                    nowGift[i]++;
                } else if (giftArray[i][j] == giftArray[j][i] && giftNum[i] > giftNum[j]) {
                    nowGift[i]++;
                }
            }
        }
        
        return Arrays.stream(nowGift).max().getAsInt();
    }
}