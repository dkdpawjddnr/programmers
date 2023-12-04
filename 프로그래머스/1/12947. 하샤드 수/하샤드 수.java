class Solution {
    public boolean solution(int x) {
        int number = x;
        int sum = 0;
        
        while(number != 0){
            sum += number % 10;
            number /= 10;
        }
        return x % sum == 0 ? true : false;
    }
}