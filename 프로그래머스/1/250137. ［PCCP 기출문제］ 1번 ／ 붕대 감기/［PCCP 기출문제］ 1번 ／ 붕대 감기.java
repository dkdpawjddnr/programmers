class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int answer = 0;
        int now_time = 0;
        int max_time = attacks[attacks.length-1][0];
        int idx = 0;
        int cnt = 0;
        int max_health = health;
        
        while(now_time <= max_time){
            if(now_time == attacks[idx][0]){
                health-=attacks[idx][1];
                idx++;
                cnt = 0;
                if(health<=0){
                    return -1;
                }
            }else{
                cnt++;
                health+=bandage[1];
                if(cnt == bandage[0]){
                    health+= bandage[2];
                    cnt = 0;
                }
                if(health > max_health){
                    health = max_health;
                }
            }
            now_time++;
        }
        
        return health;
    }
}