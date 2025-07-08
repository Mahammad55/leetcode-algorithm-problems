package numeric.easy;

import java.util.Arrays;

// 3536
public class MaximumProductTwoDigits {
    public static void main(String[] args) {
        System.out.println(maxProduct(527292));
    }

    public static int maxProduct(int n) {
        String value = String.valueOf(n);
        char[] charArray = value.toCharArray();
        Arrays.sort(charArray);
        int a = charArray[charArray.length - 1] - '0';
        int b = charArray[charArray.length - 2] - '0';
        return a * b;
    }

    public static int maxProduct1(int n) {
        int[] digits = String.valueOf(n).chars()
                .map(c -> c - '0')
                .sorted()
                .toArray();

        return digits[digits.length - 1] * digits[digits.length - 2];
    }
}
