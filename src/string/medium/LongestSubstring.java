package string.medium;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// 3
public class LongestSubstring {
    public static void main(String[] args) {
        System.out.println(isNonRepeated1("slm"));
    }

    public static int lengthOfLongestSubstring(String s) {
        int count = s.length(); // 5

        for (int i = 0; i < s.length(); i++) {
            int subStringCount = s.length() - count + 1;

            for (int j = 0; j < subStringCount; j++) {
                String subString = s.substring(j, j + count);
                if (isNonRepeated(subString)) {
                    return subString.length();
                }
            }

            count--;
        }

        return 0;
    }

    public static boolean isNonRepeated(String str) {
        Map<Character, Integer> map = new HashMap<>();

        for (Character character : str.toCharArray()) {
            map.put(character, map.getOrDefault(character, 0) + 1);
        }

        for (char c : str.toCharArray()) {
            if (map.get(c) > 1) {
                return false;
            }
        }
        return true;
    }

    public static boolean isNonRepeated1(String str) {
        Set<Character> set = new HashSet<>();

        for (char c : str.toCharArray()) {
            set.add(c);
        }

        return set.size() == str.length();
    }
    public static boolean isNonRepeated2(String str){
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                    return false;
                }
            }
        }
        return true;
    }
}
