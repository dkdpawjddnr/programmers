import java.lang.StringBuilder;
class Solution {
    public String solution(String s) {
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder(s);
        int count = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (sb.charAt(i) == ' ') {
                count = 0;
            } else if (count % 2 == 0) {
                sb.setCharAt(i, Character.toUpperCase(sb.charAt(i)));
                count++;
            } else {
                count++;
            }
        }
        
        String answer = sb.toString();
        return answer;
    }
}