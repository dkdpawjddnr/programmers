import java.util.Scanner;
 
public class Main {
	public static void main(String args[]) {
 
		Scanner sc = new Scanner(System.in);
 
		int c = sc.nextInt();
		int arr[] = new int[c];
 
		for (int i = 0; i < c; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			arr[i] = a + b;
		}
 
		for (int k : arr) {
			System.out.println(k);
		}
	}
 
}