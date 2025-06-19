import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        Set<String> userSet = new HashSet<>();
        int result = 0;

        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();

            if (line.equals("ENTER")) {
                userSet.clear();
            } else {
                if (!userSet.contains(line)) {
                    userSet.add(line);
                    result++;
                }
            }
        }

        System.out.println(result);
    }
}