public class Solution {
    public int solution(String t, String p) {
        int tLen = t.length(), pLen = p.length();
        Long pLong = Long.parseLong(p);

        int answer = 0;
        for(int i=0; i<=tLen-pLen; i++) {
            Long tLong = Long.parseLong(t.substring(i,i+pLen));
            if(tLong <= pLong) answer++;
        }        

        return answer;
    }
}