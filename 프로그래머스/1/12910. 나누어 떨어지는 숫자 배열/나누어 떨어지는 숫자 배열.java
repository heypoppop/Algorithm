import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr, int divisor) {
    	int[] answer = Arrays.stream(arr).filter(x -> x % divisor == 0).toArray();
        if(answer.length == 0) answer = new int[] {-1};
        Arrays.sort(answer);
        return answer;
    }
}