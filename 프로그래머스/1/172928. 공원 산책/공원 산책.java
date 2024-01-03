import java.util.*;

class Solution {
    public int[] solution(String[] park, String[] routes) {
        int m = park.length;
        int n = park[0].length();
        int curX = 0;
        int curY = 0;
        char[][] grid = new char[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = park[i].charAt(j);
                if (grid[i][j] == 'S') {
                    curX = i;
                    curY = j;
                }
            }
        }

        int[] dx = { -1, 1, 0, 0 };
        int[] dy = { 0, 0, -1, 1 };
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('N', 0);
        map.put('S', 1);
        map.put('W', 2);
        map.put('E', 3);

        for (String command : routes) {
            char op = command.charAt(0);
            int move = command.charAt(2) - '0';
            int nextX = curX;
            int nextY = curY;
            boolean isOK = true;
            for (int i = 0; i < move; i++) {
                nextX += dx[map.get(op)];
                nextY += dy[map.get(op)];
                if (nextX < 0 || nextY < 0 || nextX >= m || nextY >= n || grid[nextX][nextY] == 'X') {
                    isOK = false;
                    break;
                }
            }
            if (isOK) {
                curX = nextX;
                curY = nextY;
            }
        }
        return new int[] { curX, curY };
    }
}