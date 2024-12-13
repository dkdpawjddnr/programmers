import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        if (x == 60 && y == 60 && z == 60) {
            System.out.println("Equilateral");
        } else if (x + y + z == 180) {
            if (x != y && y != z && z != x) {
                System.out.println("Scalene");
            } else {
                System.out.println("Isosceles");
            }
        } else
            System.out.println("Error");
        sc.close();
    }
}