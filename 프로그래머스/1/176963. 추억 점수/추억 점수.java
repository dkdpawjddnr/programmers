import java.util.*;
class Solution {
	public int[] solution(String[] name, int[] yearning, String[][] photo) {
		int[] answer = {};
		answer = new int[photo.length];

		HashMap<String, Integer> score = new HashMap<String, Integer>();
		for(int i=0; i<name.length; i++) {
			score.put(name[i], yearning[i]);
		}

		for(int i=0; i< photo.length; i++) {
			int thisPhotoScore = 0;  
			for(int j=0; j<photo[i].length; j++) {
				if(score.get(photo[i][j]) != null) {
					thisPhotoScore += score.get(photo[i][j]);
				}
			}
			answer[i] = thisPhotoScore;
        }
        
		return answer;
    }
}