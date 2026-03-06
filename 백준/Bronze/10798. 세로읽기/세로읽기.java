import java.io.*;
import java.util.ArrayList;

public class Main {
    static ArrayList<String> list = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        for(int i=0;i<5;i++){
            String input = br.readLine();
            for(int j=0;j<input.length();j++){
                if(list.size()<=j)
                    list.add(input.charAt(j)+"");
                else		
                    list.set(j,list.get(j) + input.charAt(j));
            }
        }
        for(int i=0;i<list.size();i++)
            bw.write(list.get(i));
        
        bw.flush();		
        bw.close();
        br.close();
    }
}

