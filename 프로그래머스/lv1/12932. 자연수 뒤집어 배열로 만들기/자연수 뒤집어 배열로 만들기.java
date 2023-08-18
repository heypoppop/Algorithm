import java.util.*;
class Solution {
    public int[] solution(long n) {
        String input = ""+n;
        int[] answer = new int[input.length()];
        int i = 0;
        while(n>0) {
            answer[i++] = (int) (n%10);
            n /= 10;
        }
        return answer;
    }
}