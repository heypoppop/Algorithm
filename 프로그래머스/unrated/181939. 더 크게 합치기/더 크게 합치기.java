class Solution {
    public int solution(int a, int b) {
        String answer1 = String.valueOf(a) + String.valueOf(b);
        String answer2 = String.valueOf(b) + String.valueOf(a);
        if (Integer.valueOf(answer1) > Integer.valueOf(answer2)) {
            return Integer.valueOf(answer1);
        } else {
            return Integer.valueOf(answer2);
        }
    }
}