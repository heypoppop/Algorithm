import java.util.HashMap;
import java.util.Map;
class Solution {
    public int solution(String s) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("zero","0"); hashMap.put("one", "1");
        hashMap.put("two", "2"); hashMap.put("three", "3");
        hashMap.put("four", "4"); hashMap.put("five", "5");
        hashMap.put("six", "6"); hashMap.put("seven", "7");
        hashMap.put("eight", "8"); hashMap.put("nine", "9");
        
        for(Map.Entry<String, String> entry : hashMap.entrySet()) {
            if(s.contains(entry.getKey())) s = s.replace(entry.getKey(), entry.getValue());
        }
        
        return Integer.valueOf(s);
    }
}