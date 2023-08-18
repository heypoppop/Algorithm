class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        char letterChar = letter.charAt(0);
        for (int i = 0; i <= my_string.length()-1; i++) {
            if (!(my_string.charAt(i) == letterChar)) {
                answer += my_string.charAt(i);
                }
        }
        return answer;
    }
}