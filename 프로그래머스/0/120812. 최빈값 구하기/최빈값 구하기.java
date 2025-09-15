import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;

public class Solution {
	
	public int solution(int[] arr) {
		int answer = 0;
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int i = 0; i < arr.length; i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
		}
		
		int index = 0;
		int max = 0;
		for(int i = 0; i < arr.length; i++) {
			if(max < map.get(arr[i])) {
				index = i;
				max = map.get(arr[i]);
			}
				
		}
		int count = 0;
		Collection<Integer> values = map.values();
		for(int n : values) {
			if(n == max) {
				count++;
			}
		}
		return count != 1 ? -1:arr[index];
	}

	public static void main(String[] args) {
		Solution T = new Solution();
		Scanner sc = new Scanner(System.in);
		
		int[] arr = {1,1,2,2};
		System.out.print(T.solution(arr));
	}

}
