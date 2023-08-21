import java.util.Arrays;
class Solution {
    public String[] solution(String[] strings, int n) {
        return Arrays.stream(strings).sorted().sorted((s1, s2) -> s1.charAt(n) - s2.charAt(n)).toArray(String[]::new);
    }
}