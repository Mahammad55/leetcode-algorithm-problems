package string.easy;

// 125
public class ValidPalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("0P"));
    }

    public static boolean isPalindrome(String s) {
        return checkPalindrome(removeUnLetters(s));
    }

    private static boolean checkPalindrome(String text) {
        return text.contentEquals(new StringBuilder(text).reverse());
    }

    private static String removeUnLetters(String text) {
        String replace = "";
        for (char ch : text.toCharArray()) {
            if (Character.isLetter(ch) || Character.isDigit(ch)) replace += ch;
        }

        return replace.toLowerCase();
    }

}
