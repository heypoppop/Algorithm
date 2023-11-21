import java.util.Arrays;
import java.util.Collections;
class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arrList = s.split("");
        Arrays.sort(arrList, Collections.reverseOrder());
        for(String str : arrList) {
            answer += str;
        }
        return answer;
    }
}