import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
 
public class Main {
	static int N, C, H, W, K, M, T, a, b, c;
	static int answer = 0;
	static int[] arr;
	static int[][][] cache;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		cache = new int[51][51][51];
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			c = Integer.parseInt(st.nextToken());
			if(a == -1 && b == - 1 && c == -1) {
				return ;
			}
			
			
			for(int i=0;i<51; i++) {
				for(int j=0; j<51; j++) {
					Arrays.fill(cache[i][j], -1);
				}
			}
			
			System.out.println("w("+a+", "+b+", "+c+") = "+w(a, b, c));
		}
		
	}
	
	static int w(int a, int b, int c) {
		if(a <= 0 || b <= 0 || c <= 0) {
			return 1;
		}
		
		if(cache[a][b][c] != -1) return cache[a][b][c];
		
		if( a > 20 || b > 20 || c > 20) {
			return cache[a][b][c] = w(20, 20, 20);
		}
		if(a < b && b < c) {
			return cache[a][b][c] = w(a, b, c-1) + w(a, b-1, c- 1) - w(a, b-1, c);
		}
		return cache[a][b][c] = w(a-1, b, c) + w(a-1, b-1, c) + w(a-1, b, c-1) - w(a-1, b-1, c-1);
	}
	
}