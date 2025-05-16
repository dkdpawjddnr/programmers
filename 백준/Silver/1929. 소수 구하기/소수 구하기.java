import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		boolean[] b = new boolean[N+1];
		b[0] = true;
		b[1] = true;
		
		for(int i = 2; i * i<= N; i++) {
			if(!b[i]) {
				for(int j = i * i; j <= N; j+=i) {
					b[j] = true;
				}
			}
		}
		
		for(int i = M; i < b.length; i++) {
			if(!b[i]) {
				System.out.println(i);
			}
		}
	}
}
