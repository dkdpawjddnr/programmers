class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        boolean[] chk = new boolean[n + 1];
        
        for(int i = 0; i<section.length; i++){
           
            if(!chk[section[i]]){
                if(section[i] + m > n + 1){
                    for(int j = section[i]; j<=n; j++){
                        chk[j] = true;
                    }
                    answer++;
                }
                else{
                    for(int j = section[i]; j<section[i] + m; j++){
                        chk[j] = true;
                    }
                    answer++;
                }
            }
        }
        
        return answer;
    }
}