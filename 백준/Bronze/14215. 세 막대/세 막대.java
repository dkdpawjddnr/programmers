import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max = a;
        int remainders = b + c;
        if(b > max) {
            max = b;
            remainders = a + c;
        }
        if(c > max) {
            max = c;
            remainders = a + b;
        }

        if(max >= remainders) {
            max = remainders - 1;
        }

        System.out.println(max+remainders);
    }
}