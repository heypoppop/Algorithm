import java.util.stream.IntStream;
import java.util.stream.Stream;
class Solution {
    public double solution(int[] arr) {
        double sum = 0;
        for (int a :arr) {
        sum += a;
        }
        return sum/arr.length;
    }
}