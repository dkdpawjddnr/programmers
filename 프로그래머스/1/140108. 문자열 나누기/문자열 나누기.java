class Solution {
    public static int solution(String str) {
        int result = 0;
        int stand = 0;
        int target = 0;
        for(int i=0;i<str.length();i++) {
            stand++;
            for(int j=i+1;j<str.length();j++) {
                if(str.charAt(i)==str.charAt(j)) {
                    stand++;
                }else {
                    target++;
                    if(stand==target) {
                        result++;
                        stand = target = 0;
                        i = j;
                        break;
                    }
                }
            }
        }
        result = stand==target?result:result+1;
        return result;
    }
}