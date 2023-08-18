    class Solution {
        public boolean solution(int x) {
        int sum = 0;
        String[] strArr = (x+"").split("");
        for (int i = 0; i < strArr.length; i++) {
            sum += Integer.valueOf(strArr[i]);
        }
        return x % sum == 0 ? true : false;
        }
    }