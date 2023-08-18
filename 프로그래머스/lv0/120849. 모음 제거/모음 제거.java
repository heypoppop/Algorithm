class Solution {
    public String solution(String my_string) {
        String[] vowels = new String[] {"a", "e", "i", "o", "u"};
        for (String vowel : vowels) {
            if(my_string.contains(vowel)) {
                my_string = my_string.replace(vowel, "");
            }
        }
        return my_string;
    }
}