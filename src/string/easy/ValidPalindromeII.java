package string.easy;

//680
public class ValidPalindromeII {
    public static void main(String[] args) {
        System.out.println(isPalindrome("salam"));
        System.out.println(isPalindrome("ala"));
        System.out.println(isPalindrome("abca"));
    }

    public static boolean isPalindrome(String text) {
        int left = 0;
        int right = text.length() - 1;

        while (left < right) {
            if (text.charAt(left) != text.charAt(right)) {
                return checkPalindrome(text, left + 1, right) || checkPalindrome(text, left, right - 1);
            }
            left++;
            right--;
        }
        return true;
    }

    private static boolean checkPalindrome(String text, int left, int right) {
        while (left < right) {
            if (text.charAt(left) != text.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
