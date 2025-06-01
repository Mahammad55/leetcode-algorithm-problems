package string.easy;

import java.util.LinkedHashMap;
import java.util.Map;

// 387
public class FirstUniqueCharacterString {
    public static void main(String[] args) {
        System.out.println(firstUniqChar2("loveleetcode"));
    }

    public static int firstUniqChar(String s) {
        for (int i = 0; i < s.length(); i++) {
            char first = s.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < s.length(); j++) {
                char second = s.charAt(j);
                if (first == second && i != j) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) return i;
        }
        return -1;
    }

    public static int firstUniqChar1(String s) {
        int[] freq = new int[26];

        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1;
    }

    public static int firstUniqChar2(String s) {
        Map<Character, Integer> map = new LinkedHashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) return i;
        }

        return -1;
    }
}
