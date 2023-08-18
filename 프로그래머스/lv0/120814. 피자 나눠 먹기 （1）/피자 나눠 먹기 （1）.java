class Solution {
    public int solution(int n) {
        int answer = 0;
        if (n >= 1 && n <= 100 ) {
            if (n % 7 == 0) {
                answer = n/7;
                return answer;
            }
            answer = (n/7) + 1;
            return answer;
        }
        return answer;
    }
}