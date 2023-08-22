import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < commands.length; i++) {
            Arrays.stream(array, commands[i][0] - 1, commands[i][1]).sorted().skip(commands[i][2] - 1).limit(1).forEach(x -> list.add(x));
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}