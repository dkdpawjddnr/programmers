import java.util.Scanner;

public class Main {
	
	public static int solution(String str) {
		int count_to_all_zero = 0; // 전체를 0으로 만들기 위한 작업
		int count_to_all_one = 0; // 전체를 1로 만들기 위한 작업
		
		char[] arr = str.toCharArray();
		
		if(arr[0] == '0') {
			count_to_all_one += 1;
		} else if (arr[0] == '1') {
			count_to_all_zero += 1;
		}
		
		for(int i = 0; i < str.length()-1; i++) {
			if(arr[i] != arr[i+1]) {
				if(arr[i+1] == '0') {
					count_to_all_one += 1;
				}
				if(arr[i+1] == '1') {
					count_to_all_zero += 1;
				}
			}
		}
		return Math.min(count_to_all_zero, count_to_all_one);
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		System.out.println(solution(str));

	}

}
