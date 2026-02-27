import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().toUpperCase();
        int maxValue = 0;
        char maxChar = 0;
        
        int[] alphabetArr = new int[26];
        for(int i=0; i<str.length(); i++){
            alphabetArr[str.charAt(i)-'A']++;
        }        
        for(int i=0; i<26; i++){
            int compare = alphabetArr[i]- maxValue;
            if(compare > 0){
                 maxValue = alphabetArr[i]; 
                 maxChar = (char)('A'+i);
            } else if(compare == 0 ) maxChar ='?';            
        }        
        System.out.println(maxChar);        
    }    
}