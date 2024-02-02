import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        
        List<Integer> list = new ArrayList<>();
        
        Arrays.sort(num_list);
        
        for (int i = 0; i < 5; i++) {
            list.add(num_list[i]);
        }
        
        int[] answer = new int[list.size()];
        
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}