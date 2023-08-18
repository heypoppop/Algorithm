class Solution {
    public int solution(int a, int b) {
        if(Integer.valueOf(a + "" + b) < (2 * a * b)) {
            return (2 * a * b);
        } else {
            return Integer.valueOf(a + "" + b);
        }
    }
}


