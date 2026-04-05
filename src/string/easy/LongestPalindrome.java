package string.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// 409
public class LongestPalindrome {

    public static void main(String[] args) {
        System.out.println(longestPalindrome("abccccdd"));
    }

    public static int longestPalindrome(String s) {
        Map<Character, Integer> count = new HashMap<>();

        for (char c : s.toCharArray()) {
            count.put(c, count.getOrDefault(c, 0) + 1);
        }

        int sum = 0;
        boolean hasOdd = false;

        for (Integer value : count.values()) {
            sum += (value / 2) * 2;
            if (value % 2 == 1) {
                hasOdd = true;
            }
        }

        return hasOdd ? sum + 1 : sum;
    }

    public static int longestPalindrome1(String s) {
        Set<Character> set = new HashSet<>();
        int count = 0;

        for (char c : s.toCharArray()) {
            if (set.contains(c)) {
                count += 2;
                set.remove(c);
            } else {
                set.add(c);
            }
        }

        return set.isEmpty() ? count : count + 1;
    }

    public static int longestPalindrome2(String s) {
        int[] freq = new int[128];

        for (char c : s.toCharArray()) freq[c]++;

        int sum = 0;
        boolean hasOdd = false;

        for (int v : freq) {
            sum += (v / 2) * 2;
            if (v % 2 == 1) hasOdd = true;
        }

        return hasOdd ? sum + 1 : sum;

    }

}
