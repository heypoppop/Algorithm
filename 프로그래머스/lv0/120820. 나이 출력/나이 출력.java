class Solution {
    public int solution(int age) {
        int year = 2022;
        int answer = 0;
        
        if (0<age && age<=120) {
            answer = (year-age) +1;
            return answer;
        }
        
        return answer;
    }
}