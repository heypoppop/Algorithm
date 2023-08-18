import java.util.ArrayList;
class Solution {
    public int solution(int[] array, int height) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (height < array[i]) {
                answer.add(array[i]);
            }
        }
        return answer.size();
    }
}