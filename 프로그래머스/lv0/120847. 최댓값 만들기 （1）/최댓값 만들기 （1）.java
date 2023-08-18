import java.util.Arrays;
class Solution {
    public int solution(int[] numbers) {
        int a, b;
        Arrays.sort(numbers);
        a = numbers[numbers.length-1];
        b = numbers[numbers.length-2];
        return a*b;
    }
}