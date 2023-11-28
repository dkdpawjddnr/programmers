class Solution {
    public static long solution(long n) {
        long answer = 0;

        for(long num =1; num <= n; num++){
            if(num * num == n){
                answer = (num+1)*(num+1);
                break;
            } else{
                answer = -1;
            }
        }
        return answer;
    }
}