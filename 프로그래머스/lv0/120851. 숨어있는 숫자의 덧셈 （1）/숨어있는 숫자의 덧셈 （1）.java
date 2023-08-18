class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String str = my_string.replaceAll("[^0-9]", "");
        String[] strArray = str.split("");

        for (int i=0; i < strArray.length; i++) {
            answer += Integer.parseInt(strArray[i]);
        }
        return answer;
    }
}