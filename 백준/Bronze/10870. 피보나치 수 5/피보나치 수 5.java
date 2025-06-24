import java.io.*;
import java.util.*;

public class Main {

	private static int fibonacci(int x, int y, int num) {
		if (num > 0) {
			return fibonacci(y, x + y, num - 1);
		}
		return x + y;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		if (N == 0) { // N이 0일 때,
			System.out.println(0);
		} else if (N == 1) { // N이 1일 때,
			System.out.println(1);
		} else { // 0, 1이 이미 주어지므로 N-2 해줘야 한다.
			System.out.println(fibonacci(0, 1, N - 2));
		}
	}
}