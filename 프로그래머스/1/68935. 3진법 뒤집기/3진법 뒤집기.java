class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String str = Integer.toString(n,3);
        String reverse = new StringBuilder(str).reverse().toString();
        // 3진수에서 10진수로 바꾸기 - Integer.parseInt(a,3)
        answer = Integer.valueOf(reverse, 3);
        return answer;
    }
}