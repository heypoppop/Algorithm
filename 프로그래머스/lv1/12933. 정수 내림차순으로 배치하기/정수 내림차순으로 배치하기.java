import java.util.*;
class Solution {
    public long solution(long n) {
        String[] strArr = (n+"").split("");
        String str = "";
        Arrays.sort(strArr);
        for (int i = 0; i < strArr.length; i++) {
            str += strArr[strArr.length-i-1];
        }
        return Long.valueOf(str);
    }
}