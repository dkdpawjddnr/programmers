import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		Set <String> set = new TreeSet<>();
		Map <String, Integer> map = new HashMap<>();
		while(N-- > 0) {
			String s = br.readLine();
			if(s.length() >= M) {
				set.add(s);
				if(map.containsKey(s))
					map.put(s, map.get(s) + 1);
				else
					map.put(s, 1);
			}
		}
		List <String> list = new ArrayList<>(set);
		Collections.sort(list, (a, b)->b.length() - a.length());
		Collections.sort(list, (a, b)->map.get(b) - map.get(a));
		
		StringBuilder sb = new StringBuilder();
		for(String s : list)
			sb.append(s).append('\n');
		System.out.println(sb.toString());
	}
}