import java.util.*;

public class Main {

	public static void main(String[] args) {
	
		LinkedHashMap<String, String> hm = new LinkedHashMap<>();
		hm.put("c=","č");
		hm.put("c-","ć");
		hm.put("dz=","dž");
		hm.put("d-","đ");
		hm.put("lj","lj");
		hm.put("nj","nj");
		hm.put("s=","š");
		hm.put("z=","ž");
		
		String[] hmKeys = hm.keySet().toArray(new String[hm.size()]);
		
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		
		for(int i=0; i<hmKeys.length; i++) {
			if(str.contains(hmKeys[i])) {
			
				str = str.replace(hmKeys[i], "*");
			}
		}
		System.out.println(str.length());
	}

}