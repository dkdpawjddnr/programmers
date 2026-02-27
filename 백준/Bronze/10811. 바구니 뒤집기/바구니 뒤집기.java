import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
   
   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
      StringTokenizer st = new StringTokenizer( br.readLine() );
      int N = Integer.parseInt(st.nextToken());
      int M = Integer.parseInt(st.nextToken());
  
      int[] num = new int[N];
      
      for(int i = 0; i < N;i++) {
    	  num[i] = i+1;
      }
      for(int i = 0; i < M;i++) {
    	  st = new StringTokenizer(br.readLine());
    	  int A = Integer.parseInt(st.nextToken());
    	  int B = Integer.parseInt(st.nextToken());
    	  int[] copy_num = Arrays.copyOfRange(num, A-1, B);
    	  int c = copy_num.length;
    	  for(int j = A-1; j < B; j++)
    	  {
    		num[j] = copy_num[c-1];
    		c--;
    	  }
      }
      for(int j = 0; j < N;j++) {
    	  bw.write(num[j] + " ");
      }
      
      bw.flush();
      bw.close();
      br.close();
   }   
}