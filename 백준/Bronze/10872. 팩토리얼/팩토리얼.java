
import java.util.Scanner;

public class Main {
	
	public static int DFS(int N) {
		if(N == 0) {
			return 1;
		}
		
		return N * DFS(N-1);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		System.out.println(DFS(N));
	}

}
