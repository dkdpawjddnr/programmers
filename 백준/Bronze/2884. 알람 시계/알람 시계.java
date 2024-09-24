import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");
        int hour = Integer.parseInt(str[0]);
        int minute = Integer.parseInt(str[1]);

        if(minute < 45) {
            hour--;
            minute = 60 - (45 - minute);

            if(hour < 0) {
                hour = 23;
            }
            System.out.println(hour + " " + minute);
        }
        else {
            minute = minute - 45;
            System.out.println(hour + " " + minute);
        }
    }
}
