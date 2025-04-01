import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        HashSet<String> set = new HashSet<String>();
        String s = br.readLine();
        
        for(int i=0; i<s.length(); i++)
        {
            for(int j=i+1; j<=s.length(); j++)
            {
                String sub = s.substring(i,j);
                set.add(sub);
            }
        }
        
        bw.write(set.size()+"");
        
        bw.flush();
        bw.close();
    }
        
}