import java.util.*;
class Solution {
    public long solution(long n) {
        String answer = n + "";
String str = "";
char[] answerch = answer.toCharArray();
Arrays.sort(answerch);
for (int i = 0; i < answerch.length; i++) {
    str += String.valueOf(answerch[answerch.length-i-1]);
}
return Long.valueOf(str);
    }
}