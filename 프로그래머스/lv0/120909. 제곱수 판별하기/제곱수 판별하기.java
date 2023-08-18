class Solution {
    public int solution(int n) {
        int squareRoot = (int)Math.sqrt(n);
        if (n == squareRoot * squareRoot) {
            return 1;
        }
        return 2;
    }
}