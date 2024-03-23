package numeric.easy;

// 9
public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int originNumber = x;
        int reverseNumber = 0;

        while (x != 0) {
            int rest = x % 10;
            reverseNumber = reverseNumber * 10 + rest;
            x /= 10;
        }

        return reverseNumber == originNumber;
    }

    public boolean isPalindrome1(int x) {
        String stringNumber = String.valueOf(x);

        for (int i = 0; i < stringNumber.length() / 2; i++) {
            if (stringNumber.charAt(i) != stringNumber.charAt(stringNumber.length() - i - 1)) {
                return false;
            }
        }

        return true;
    }

    public boolean isPalindrome2(int x) {
        String stringNumber = String.valueOf(x);
        return new StringBuilder(stringNumber).reverse().toString().equals(stringNumber);
    }
}
