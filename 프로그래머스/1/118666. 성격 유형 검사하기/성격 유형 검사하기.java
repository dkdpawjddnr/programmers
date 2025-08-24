import java.util.*;
 
class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        
        Map<String, Integer> map = new HashMap<>();
        String[] mbti = "RTCFJMAN".split("");
        
        for(String s : mbti){
            map.put(s, 0);
        }
        
        for(int i=0; i<survey.length; i++){
            String sur = survey[i];
            int cho = choices[i];
            
            if(cho < 4){
                map.put(String.valueOf(sur.charAt(0)), map.get(String.valueOf(sur.charAt(0))) + (4 - cho));
            }else if(cho > 4){
                map.put(String.valueOf(sur.charAt(1)), map.get(String.valueOf(sur.charAt(1))) + (cho - 4));
            }
        }
        
        answer += map.get("R") >= map.get("T") ? "R" : "T";
        answer += map.get("C") >= map.get("F") ? "C" : "F";
        answer += map.get("J") >= map.get("M") ? "J" : "M";
        answer += map.get("A") >= map.get("N") ? "A" : "N";
        
        System.out.println(answer);
        
        return answer;
    }
}