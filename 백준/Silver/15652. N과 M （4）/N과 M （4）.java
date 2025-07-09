import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class Main {
	static int n;
	static int m;
	static int[] answer;
	static StringBuilder sb = new StringBuilder(); 
	public static void dfs(int depth, int prev) {
		if(depth == m) {
			
			for(int i : answer) 
				sb.append(i+" ");
			sb.append('\n');
			return;
			
		}
		for(int i = 0; i< n; i++) {
			if(i<prev)
				continue;
			answer[depth] = i+1;
			dfs(depth+1,i);
		}
	}
	public static void main(String[] args) throws IOException{
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		m = scan.nextInt();
		
		answer = new int[m];
		
		dfs(0,-1);
		
		System.out.println(sb);
	}
}