class Solution {
    public String solution(int[] food) {
        String result = "0";
        
        for(int i=food.length-1;i>0;i--){
            String prefix = "";
            String suffix = "";
            for(int j=0;j<food[i]/2;j++){
                prefix += i;
                suffix += i;
            }
            result = prefix + result + suffix ;
        }
        return result;
    }
}