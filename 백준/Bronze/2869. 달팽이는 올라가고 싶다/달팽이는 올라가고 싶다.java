import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		double a, b, v;
		
		st = new StringTokenizer(br.readLine(), " ");
		
		a = Double.parseDouble(st.nextToken());
		b = Double.parseDouble(st.nextToken());
		v = Double.parseDouble(st.nextToken());
		
		System.out.println((int)Math.ceil((v-b)/(a-b)));
	}
}