
import java.util.Scanner;

public class Main {
	
	public static int solution(String str) {
		
		int all_zero_count = 0; // 모두 0으로 만든다.
		int all_one_count = 0; // 모두 1로 만든다.
		char[] arr = str.toCharArray();
		
		if(arr[0] =='0') {
			all_one_count += 1;
		} else if (arr[0] == '1') {
			all_zero_count += 1;
		}
		for(int i = 0; i < arr.length-1; i++) {
			if(arr[i] != arr[i+1]) {
				if(arr[i+1] == '0') {
					all_one_count++;
				} else if(arr[i+1] =='1') {
					all_zero_count++;
				}
			}
		}
		return Math.min(all_zero_count, all_one_count);
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		System.out.println(solution(str));

	}

}
