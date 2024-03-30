package array.easy2;

import java.util.Arrays;

// 14
public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower", "fkow"};
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        int min = Arrays.stream(strs).mapToInt(String::length).min().getAsInt(); // 3

        for (int i = 0; i < strs[0].length(); i++) { // 4
            int subCount = strs[0].length() - min + 1; // 1
            for (int j = 0; j < subCount; j++) {
                String subString = strs[0].substring(j, j + min);
                if (isHave(strs, subString)) return subString;
            }
            min--;
        }

        return "";
    }

    private static boolean isHave(String[] strs, String str) {
        for (int i = 0; i < strs.length - 1; i++) {
            if (!strs[i].contains(str)) return false;
            else {
                for (char c : str.toCharArray()) {
                    if (strs[i].indexOf(c) != strs[i + 1].indexOf(c)) return false;
                }
            }
        }
        return true;
    }
}
