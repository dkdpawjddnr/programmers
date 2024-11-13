import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        String[] input_ = new String[5];
        String result = "";
        
		for (int i = 0; i < 5; i++) {
        	input_[i] = sc.next();
		}
		int flag; int index = 0;
		while(true) {
			flag = 0;
			for (int i = 0; i < 5; i++) {
				if (index < input_[i].length()) {
					flag = 1;
					result += input_[i].charAt(index);
				}
			}
			if (flag == 0) break;
			index++;
		}
		System.out.println(result);
	}
}