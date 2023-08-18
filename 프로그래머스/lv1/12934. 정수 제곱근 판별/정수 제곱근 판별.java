class Solution {
    public long solution(long n) {
        long answer = 0;
        if(Math.sqrt(n) % 1 > 0) {
            return -1;
        } else {
            answer = (long)Math.pow((Math.sqrt(n)+1),2);
            return answer;
        }
    }
}