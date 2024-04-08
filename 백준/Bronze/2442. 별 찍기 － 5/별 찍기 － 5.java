import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();

        for(int i = 1; i < num+1; i++){
            for (int j = num; j > i; j--){
                System.out.print(" ");
            }
            for (int k =0; k < 2*i-1; k++ ){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
