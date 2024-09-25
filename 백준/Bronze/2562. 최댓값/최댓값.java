import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[9];
        int max = arr[0];
        int index = 0; // 몇 번째 수인지 찾는 변수

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

            if (arr[i] > max) { // max보다 arr[i]값이 더 크면
                max = arr[i]; // max에 arr[i] 값을 넣어주고,
                index = i+1; // index값을 1 증가시켜 준다.
            }
        }
        System.out.println(max);
        System.out.println(index);
    }
}