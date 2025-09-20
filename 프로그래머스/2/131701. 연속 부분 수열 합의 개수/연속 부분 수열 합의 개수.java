import java.util.*;

class Solution {
    public int solution(int[] elements) {
        int answer = 0;
        int elementsLength=elements.length;
        
        int sum=0;
        
        HashSet<Integer> answerList=new HashSet<>();
        

        for(int i=1;i<=elements.length;i++)
        {    
            for(int position=0;position<elements.length;position++)
            {
                for(int j=position;j<position+i;j++)
                {
                    sum=sum+elements[j%elements.length];
                }
        
                answerList.add(sum);
                sum=0;
            }         
        }
        answer=answerList.size();
        return answer;
    }
}