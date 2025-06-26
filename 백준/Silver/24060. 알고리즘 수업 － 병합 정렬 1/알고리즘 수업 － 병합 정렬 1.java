import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    static int[] arr;
    static int[] temp;
    static int N;
    static int K;
    static int answer;
    static int count = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Scanner sc = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        arr = new int[N];
        temp = new int[N];

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        mergeSort(0, N-1);
        if(count < K) System.out.println(-1);
        else System.out.println(answer);

        br.close();
        bw.flush();
        bw.close();
    }

    private static void mergeSort(int start, int end) {
        if(start<end) {
            int mid = (start + end) / 2;

            mergeSort(start, mid); 
            mergeSort(mid + 1, end);

            int left = start; 
            int right = mid+1; 
            int idx = start; 
            while(left <= mid && right <= end) {
                if(arr[left] > arr[right]) {
                    temp[idx++] = arr[right++];
                }
                else {
                    temp[idx++] = arr[left++];
                }
            }
            if(left >mid) {
                for(int i=right; i<=end; i++) {
                    temp[idx++] = arr[i];
                }
            } else {
                for(int i=left; i<=mid; i++){
                    temp[idx++] = arr[i];
                }
            }
            for(int i=start; i<=end; i++){
                count++;
                if(count == K) {
                    answer = temp[i];
                    return;
                }
                arr[i] = temp[i];
            }
        }
    }
}