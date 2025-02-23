import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		
		int arr[]=new int[N];
		int sort[]=new int[N];
		HashMap<Integer,Integer> map = new HashMap<>();
		StringTokenizer st= new StringTokenizer(br.readLine()," ");
		
		for(int i=0; i<N; i++) 
			arr[i]=Integer.parseInt(st.nextToken());
		sort = arr.clone();
		Arrays.sort(sort);
		int index=0;
		for(int i=0; i<N; i++) {
			if(!map.containsKey(sort[i]))
				map.put(sort[i], index++);
		}
		for(int i=0; i<N; i++)
			sb.append(map.get(arr[i])+" ");
		System.out.print(sb);
		br.close();
	    
	}
}