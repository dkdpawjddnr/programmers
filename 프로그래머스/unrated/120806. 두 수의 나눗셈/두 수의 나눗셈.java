
class Solution {
    public static int solution(int num1, int num2) {
        double answer = 0;
        if (num1 >= 0 && num1 <= 100) {
            if (num2 >= 0 && num2 <= 100) {
                answer = (double) num1 / (double) num2 * 1000;
            }
        }
        return (int)answer;
    }
}