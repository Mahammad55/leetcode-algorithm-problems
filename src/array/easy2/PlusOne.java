package array.easy2;

import java.util.Arrays;

// 66
public class PlusOne {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(new int[]{1, 2, 3})));
    }

    public static int[] plusOne(int[] digits) {
        int l = digits.length;
        for (int i = l - 1; i >= 0; --i) {
            if (digits[i] == 9) digits[i] = 0;
            else {
                digits[i]++;
                return digits;
            }
        }
        int[] newDigits = new int[l + 1];
        newDigits[0] = 1;
        return newDigits;
    }
}
