import java.util.*;
public class Main {
    static char[] arr;
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()) {
            repeat(sc.nextInt());
            System.out.println();
        }
    }
    public static void repeat(int n) {
        if(n == 0) {
            System.out.print('-');
            return;
        }

        repeat(n - 1);

        String s = " ";
        System.out.print(s.repeat((int)Math.pow(3, n - 1)));

        repeat(n - 1);
    }
}