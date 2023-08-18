class Solution {
    
    public int met(int num1, int num2) {
        if (num1 % num2 == 0) {
            return num2;
        }
        return met(num2, num1 % num2);
    }
    
    public int[] solution(int denum1, int num1, int denum2, int num2) {
        denum1 *= num2; 
        denum2 *= num1;
        
        int[] answer = new int[]{denum1 + denum2, num1 * num2};
        int max = met(answer[0], answer[1]);
        
        answer[0] /= max;
        answer[1] /= max;
        
        return answer;
    }
}