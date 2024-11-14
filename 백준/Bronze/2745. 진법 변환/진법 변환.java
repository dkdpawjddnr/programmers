import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
 
		Scanner scanner = new Scanner(System.in);
		
		String N = scanner.next();
		int B = scanner.nextInt(); 
		long result = 0; 
		
		for(int i = 0; i<N.length() ; i++ ) {
			if( '0'<= N.charAt(i) && N.charAt(i) <='9') {
				result = result * B + ((int)N.charAt(i)-(int)'0');
			} else {
				result = result * B  + ((int)N.charAt(i)-(int)'A'+10);
			}
		}
		System.out.println(result);
	}
}