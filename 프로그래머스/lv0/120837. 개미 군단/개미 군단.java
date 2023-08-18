class Solution {
    public int solution(int hp) {
        int ant1 = hp / 5;
        hp -= ant1 * 5;
        
        int ant2 = hp / 3;
        hp -= ant2 * 3;
        
        return ant1 + ant2 + hp;
    }
}