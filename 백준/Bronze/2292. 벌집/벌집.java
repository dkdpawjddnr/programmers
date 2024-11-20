import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int result = 1; 
		int cnt = 1; 
		int sum = 6;

		while (true) {
			if (n <= cnt) {
				break;
			}
			cnt += sum;
			sum += 6;
			result++;
		}
		System.out.println(result);
	}
}