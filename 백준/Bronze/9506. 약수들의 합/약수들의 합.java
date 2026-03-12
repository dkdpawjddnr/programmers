import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
	public static void main (String[] args) throws java.lang.Exception {
	    Scanner in = new Scanner(System.in);
        
        while(true){
            StringBuilder sb = new StringBuilder();
            int N = in.nextInt();
            
            if(N==-1) break;
            
            int sum = 0;
            sb.append(N + " = ");
           
            for(int i=1; i<N; i++){
                if(N%i==0){
                    sb.append(i + " + ");
                    sum+=i;
                }
            }
            
            if(N==sum){
                sb.setLength(sb.length() - 3);
                System.out.println(sb);
            }else{
                System.out.println(N + " is NOT perfect.");
            }
        }
	}
}