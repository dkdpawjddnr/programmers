class Solution {
    public int solution(int[] wallet, int[] bill) {
        int width = Math.max(wallet[0], wallet[1]);
        int height = Math.min(wallet[0], wallet[1]);

        int answer = 0;

        while (true) {
            if (width >= Math.max(bill[0], bill[1]) &&
                    height >= Math.min(bill[0], bill[1])) {
                break;
            }

            if (bill[0] >= bill[1]) {
                bill[0] /= 2;
            } else {
                bill[1] /= 2;
            }
            answer++;
        }
        return answer;
    }
}