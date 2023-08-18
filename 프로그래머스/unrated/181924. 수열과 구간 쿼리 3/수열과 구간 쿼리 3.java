class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int arrint = 0;
        for(int i = 0; i < queries.length; i ++) {
            arrint = arr[queries[i][0]];
            arr[queries[i][0]] = arr[queries[i][1]];
            arr[queries[i][1]] = arrint;
        }
        return arr;
    }
}