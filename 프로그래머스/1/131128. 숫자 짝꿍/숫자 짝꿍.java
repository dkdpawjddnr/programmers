class Solution {
    public String solution(String X, String Y) {
        StringBuilder answer = new StringBuilder();
        int x[]=new int[10];
        int y[]=new int[10];
        for(int i=0;i<X.length();i++){
            int num = Integer.parseInt(X.substring(i, i+1));
            x[num]+=1;
        }
        for(int i=0;i<Y.length();i++){
            int num = Integer.parseInt(Y.substring(i, i+1));
            y[num]+=1;
        }
        for(int i=9;i>=0;i--){
            for(int j=0;j<Math.min(x[i], y[i]);j++){
                answer.append(i);
            }
        }
        if(answer.toString().equals("")){
            return "-1";
        }else if(answer.toString().charAt(0)=='0'){
            return "0";
        }

        return answer.toString();
    }
}