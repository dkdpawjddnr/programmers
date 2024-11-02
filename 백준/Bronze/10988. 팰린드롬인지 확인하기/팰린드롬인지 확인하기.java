import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String S = s.nextLine();
        
        StringBuilder builder = new StringBuilder();

        for(int i = S.length()-1; i>=0;i--) {
            builder.append(S.charAt(i));
        }
        
        if (S.equals(builder.toString())) { 
            System.out.println(1);
        }else {
            System.out.println(0);
        }
    }
}