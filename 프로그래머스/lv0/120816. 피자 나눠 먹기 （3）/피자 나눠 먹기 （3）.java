class Solution {
    public int solution(int slice, int n) {
        int answer = 0;
        if (n >= 1 && n <= 100 ) {
            if (n % slice == 0) {
                answer = n/slice;
                return answer;
            }
            answer = (n/slice) + 1;
            return answer;
        }
        return answer;
    }
}