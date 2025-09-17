class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        
        int card1Index = 0;
        int card2Index = 0;
        
        for (var word: goal){
            if ((cards1.length != card1Index) && (word.equals(cards1[card1Index]))){
                 card1Index += 1;
             }
            else if ((cards2.length != card2Index) && (word.equals(cards2[card2Index]))){
                card2Index += 1;
            }
            else{
                return "No";
            }
            
        }
        
        return "Yes";
    }
}