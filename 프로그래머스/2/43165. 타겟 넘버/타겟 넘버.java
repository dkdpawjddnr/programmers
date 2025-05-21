class Solution {
    int answer = 0;

    public int solution(int[] numbers, int target) {
        dfs(numbers, 0, target, 0);
        return answer;
    }

    private void dfs(int[] numbers, int depth, int target, int calc) {
        // 모든 numbers를 연산한 경우
        if (depth == numbers.length) {
            // 계산 결과가 target과 동일한 경우 answer 증가
            if (calc == target) {
                answer++;
            }
            
            return;
        } else {
            // 현재 숫자에서 더하는 경우
            dfs(numbers, depth + 1, target, calc + numbers[depth]);
            // 현재 숫자에서 빼는 경우
            dfs(numbers, depth + 1, target, calc - numbers[depth]);
        }
    }
}