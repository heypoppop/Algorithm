import java.util.*;
class Solution {
    public int[] solution(long n) {
        String[] strArr = (n+"").split("");
        int[] answer = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            answer[i] = Integer.valueOf(strArr[strArr.length-i-1]);
        }
        return answer;
    }
}