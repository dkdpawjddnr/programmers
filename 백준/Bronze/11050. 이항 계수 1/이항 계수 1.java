import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception{
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	int K = sc.nextInt();
    	System.out.print(factorial(N) / (factorial(N-K)*factorial(K)));
    }
    static int factorial(int n)
    {
    	long count = 1;
    	if(n == 0) return (int)count;
    	else
    	{
    		for(int i = 1; i <= n; ++i) count *= i;
    		return (int)count;
    	}
    }
}