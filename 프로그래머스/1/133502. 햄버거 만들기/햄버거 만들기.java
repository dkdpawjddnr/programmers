import java.util.Stack;
class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        Stack<Integer> s = new Stack<>();
        int csize = 0;
        for(int i=0;i<ingredient.length;i++){
            s.push(ingredient[i]);
            if(s.size()>=4){
                csize = s.size();
                if(s.get(csize-1)==1 && s.get(csize-2)==3 && s.get(csize-3)==2 && s.get(csize-4)==1){
                    answer++;
                    s.pop(); s.pop(); s.pop(); s.pop();
                }
            }
        }
        return answer;
    }
}