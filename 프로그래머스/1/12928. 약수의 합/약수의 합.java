
class Solution {
    public int solution(int n) {
        int answer = 0;
        int share = 0;
        for(int i=1; i <= n; i++){
            if(n % i == 0 ){
                share = n / i;
                answer += share;
            }
        } return answer;
    }
}