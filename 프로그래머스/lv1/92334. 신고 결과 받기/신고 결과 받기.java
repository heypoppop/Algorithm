import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        
        // 아이디, 신고당한 횟수 저장용 Map / 아이디별 메일 보낼 횟수 저장용 Map 생성
        Map<String, Integer> idList = new HashMap<>();
        Map<String, Integer> reportUser = new HashMap<>();
        
        // 생성한 Map Key값 = id_list / Value 값 = 0으로 초기화
        for (var i: id_list) {
            idList.put(i,0);
            reportUser.put(i,0);
        }
        // 중복제거하기 ex) "ryan con", "ryan con" ... -> "ryan con"
        List<String> reportlist = Arrays.stream(report).distinct().collect(Collectors.toList());
        
        // 신고당한 횟수 저장
        for (var i : reportlist) {
            String[] s = i.split(" ");
            reportUser.put(s[1], reportUser.get(s[1]) +1);
        }
        
        // 신고횟수 (value)값이 k 이상일 경우에만 메일 보낼횟수 +1
        for (var i : reportlist) {
            String[] str = i.split(" ");
            if(reportUser.get(str[1]) >= k) {
                idList.put(str[0], idList.get(str[0]) +1);
            }
        }
        
        //int[]로 반환하기 위해 배열 생성
        int[] answer = new int[id_list.length];
        
        // Map 순서보장 X 처음 받은 id_list의 순서에 맞게 value값 넣기 
        for (int i = 0; i < id_list.length; i++) {
            answer[i] = idList.get(id_list[i]);
        }
        return answer;
    }
}