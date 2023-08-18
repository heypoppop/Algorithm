class Solution {
    public int[] solution(int money) {
        int[] answer = {0, 0};
        int drinkPrice = 5500;
        answer[0] = money / drinkPrice;
        answer[1] = money % drinkPrice;
        return answer;
    }
}