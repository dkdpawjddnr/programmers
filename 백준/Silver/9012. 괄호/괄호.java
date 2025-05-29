import java.io.*;
import java.util.*;

public class Main {

	
    public static void main(String[] args) throws IOException{
    	Scanner scan = new Scanner(System.in);
    	int num = scan.nextInt();
    	
    	for(int i=0;i<num;i++) {
    		
    		System.out.println(chevkVps(scan.next()));
    	}  	
    }
    
    public static String chevkVps(String str) {
    	Stack<Character> st = new Stack<>();
    	    	
    	for(int i=0; i<str.length();i++) {
    		if(str.charAt(i)=='(')
    			st.push('(');
    		else if(st.empty()) {
    			return "NO";
    		}
    		else {
    			if(st.size()>0) {
    				st.pop();
    			}
    		}		
    	}
    	if(st.empty()) {
    		return "YES";
    	}
    	else {
    		return "NO";
    	}
    }
}