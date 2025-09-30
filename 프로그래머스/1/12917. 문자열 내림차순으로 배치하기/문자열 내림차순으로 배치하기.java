import java.util.Arrays;

class Solution {
    public String solution(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        
        StringBuffer sb = new StringBuffer(new String(arr));
        String answer = sb.reverse().toString();
        
        return answer;
    }
}