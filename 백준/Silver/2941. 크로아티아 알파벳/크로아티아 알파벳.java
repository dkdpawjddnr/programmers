import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String word = br.readLine();
        int count = 0;

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (c == '=' || c == '-') {
                continue;
            } else if (c == 'z' && i > 0 && word.charAt(i - 1) == 'd' && i + 1 < word.length() && word.charAt(i + 1) == '=') {
                continue;
            } else if ((c == 'j' && i > 0 && (word.charAt(i - 1) == 'l' || word.charAt(i - 1) == 'n'))) {
                continue;
            } else {
                count++;
            }
        }
        System.out.println(count);
    }
}