import java.io.*;
import java.util.*;
 
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer input = new StringTokenizer(br.readLine());
        long a = Long.parseLong(input.nextToken());
        long b = Long.parseLong(input.nextToken());
        long gcd = 0L;
        long multi = a * b;
        
        while(b != 0){
            long temp = a % b;
            a = b;
            b = temp;
            gcd = a;
        }
        
        long lcm = multi / gcd;
        
        bw.write(String.valueOf(lcm));
        bw.flush();
    }
}
