import java.util.*;
public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int[] num = new int[5];
		int sum = 0;
		
		for (int i = 0; i < num.length; i++) {
			num[i] = in.nextInt();
			sum += num[i];
		}
		
		double avg = sum / 5;
		
		Arrays.sort(num);
		System.out.println((int)avg);
		System.out.println(num[2]);
	}
}