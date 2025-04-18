import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int arr[] = new int[4];
		for(int i = 0; i < 4; ++i) arr[i] = in.nextInt();
		int a = (arr[0] * arr[3]) + (arr[1]* arr[2]);
		int b = arr[1] * arr[3];
		int minDivisor = gcd(a, b);
		System.out.println(a / minDivisor + " " + b / minDivisor);
	}
	public static int gcd(int a, int b)
	{
	    if(b == 0) return a;
	    else return gcd(b, a % b);
	}
}