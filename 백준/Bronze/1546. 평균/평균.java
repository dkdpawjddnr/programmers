import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int scores[] = new int[num];

        int max = -1;
        for (int i = 0; i < scores.length; i++) {
            int score = scanner.nextInt();
            scores[i] = score;
            if(score > max){
                max = score;
            }
        }

        double sum = 0;
        for (int i = 0; i < scores.length; i++){
            int score = scores[i];
            sum += ((float) score / max) * 100;
        }
        System.out.println(sum / num);
    }
}
