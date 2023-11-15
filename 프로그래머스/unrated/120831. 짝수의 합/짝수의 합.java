class Solution {
    public int solution(int n) {
        int answer = 0;
        if (n >0 && n<=1000){
            for(int i=n; i >0; i--){
                if(i % 2 == 0){
                    answer += i;
                }
                else{
                    continue;
                }
            }
        }
        return answer;
    }
}