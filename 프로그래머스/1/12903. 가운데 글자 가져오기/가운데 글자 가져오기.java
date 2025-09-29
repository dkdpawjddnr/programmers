class Solution {
    public String solution(String s) {
        String result = "";
        int len = s.length();
        int middle = s.length() / 2;
        
        return s.length() % 2 == 0 ? s.substring(middle - 1, middle + 1) : s.substring(middle, middle + 1)
;
    }
}