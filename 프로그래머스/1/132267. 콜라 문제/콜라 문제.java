class Solution {
    
    public int solution(int a, int b, int n) { 
        
        int result = 0;
        
        while(n>=a){
            result = result + (n / a)*b;
            n = ((n / a)*b) + (n % a);
        }
    
        return result;
    }
}