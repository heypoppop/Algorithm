import java.util.Arrays;
class Solution {
    public int[] solution(String my_string) {
        my_string = my_string.replaceAll("[^0-9]", "");
        String[] str = my_string.split("");
        int[] answer = new int[str.length];
        Arrays.sort(str);
        for(int i = 0; i < str.length; i++){
            answer[i] = Integer.parseInt(str[i]);
        }
        
        return answer;
    }
}