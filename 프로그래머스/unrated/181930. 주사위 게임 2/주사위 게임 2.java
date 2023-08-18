class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        if (a != b && a != c && c != b) return a+b+c;
        if (a == b && a == c) { answer += (a+b+c) * ((a*a)+(b*b)+(c*c)) * ((a*a*a)+(b*b*b)+(c*c*c)); }
        else answer += (a+b+c) * ((a*a)+(b*b)+(c*c));
        return answer;
    }
}