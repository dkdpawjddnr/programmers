import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int hour = scanner.nextInt();
        int minute = scanner.nextInt();

        if(minute < 45){
            hour--;
            minute = 60 - (45 - minute);
            if(hour < 0){
                hour = 23;
            }
            System.out.println(hour + " " + minute);
        }
        else {
            System.out.println(hour + " " + (minute - 45));
        }
        scanner.close();
    }
}

