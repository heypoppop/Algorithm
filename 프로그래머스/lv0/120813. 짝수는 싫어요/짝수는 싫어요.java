class Solution {
    public int[] solution(int n) {
        int arraySize = n % 2 == 1 ? n/2+1 : n/2;
        int[] answer = new int[arraySize];
        int i = 0;
        int k = 0;
        while(i <= n) {
            if (i%2 ==1) {
                answer[k] = i;
                k++;
            }
            i++;
        }
        return answer;
    }
}