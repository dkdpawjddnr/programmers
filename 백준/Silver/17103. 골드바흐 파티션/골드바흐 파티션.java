import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
    
    static boolean[] nums = new boolean[1_000_001];
 
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int T = Integer.parseInt(br.readLine());
        getPrime();
        
        for(int i = 0; i < T; i++) {
            int count = 0;
            int N = Integer.parseInt(br.readLine());
            
            for(int j = 2; j <= N/2; j++) {   
                if(!nums[j] && !nums[N-j]) {
                    count++;
                }
            }
            sb.append(count).append("\n");
        }
        
        System.out.println(sb);
    }
    
    // 에라토스테네스의 체
    static void getPrime() {
        nums[0] = true;
        nums[1] = true;
        
        for(int i = 2; i < Math.sqrt(nums.length); i++) {
            for(int j = i * i; j < nums.length; j += i) {  
                nums[j] = true;
            }
        }
    }
 
}