import java.util.*;
class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = Arrays.copyOf(num_list, num_list.length+1);
        if(num_list[num_list.length-1] > num_list[num_list.length-2]) {
            answer[num_list.length] = num_list[num_list.length-1] - num_list[num_list.length-2];
        } else {
            answer[num_list.length] = num_list[num_list.length-1] * 2;
        }
        return answer;
    }
}