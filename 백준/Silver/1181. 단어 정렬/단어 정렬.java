import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        String[] arr = new String[test];
        for (int i = 0; i < test; i++) {
            arr[i] = sc.next();
        }

        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()) {
                    return o1.compareTo(o2);
                }
                return o1.length() - o2.length();
            }
        });

        String beforeString = arr[0];
        System.out.println(beforeString);
        for (String s : arr) {
            if(s.equals(beforeString)){
                continue;
            } else{
                System.out.println(s);
                beforeString = s;
            }
        }

    }
}