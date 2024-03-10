package string.medium;

// 5
public class LongestPalindromic {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("babad"));
    }

    public static String longestPalindrome(String s) { //  babad  bab
        int count = s.length(); // 5

        for (int i = 0; i < s.length(); i++) {
            int countSubStrings = s.length() - count + 1;

            for (int j = 0; j < countSubStrings; j++) {
                String subString = s.substring(j, j + count);
                if (isPalindrome(subString)) {
                    return subString;
                }
            }
            count--;
        }

        return null;
    }

    public static boolean isPalindrome(String text) {
        for (int i = 0; i < text.length() / 2; i++) {
            if (text.charAt(i) != text.charAt(text.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
