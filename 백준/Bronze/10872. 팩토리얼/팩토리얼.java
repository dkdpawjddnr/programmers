
import java.util.Scanner;

public class Main {
	public static int solution(int N) {
		int answer= 1;
		
		for(int i = N; i >= 1; i--) {
			answer *= i;
		}
		
		return answer;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		System.out.println(solution(N));
	}

}
