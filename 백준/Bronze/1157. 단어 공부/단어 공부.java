import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[26];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = 0;
        }

        String n = br.readLine().toUpperCase();
        int max = 0;
        char ch = '?';

        for(int i = 0; i < n.length(); i++) {
            arr[n.charAt(i) - 'A']++;
        }

        for(int i = 0; i < 26; i++) {
            if(arr[i] > max) {
                max = arr[i];
                ch = (char)(i + 65);
            } else if(arr[i] == max) {
                ch = '?';
            }
        }
        System.out.println(ch);
    }
}