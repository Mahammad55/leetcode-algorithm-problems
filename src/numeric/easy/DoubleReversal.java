package numeric.easy;

// 2119
public class DoubleReversal {
    public static void main(String[] args) {
        System.out.println(isSameAfterReversals(125));
    }

    public static boolean isSameAfterReversals(int num) {
        return num == reverseInteger(reverseInteger(num));
    }

    private static int reverseInteger(int num) {
        int reversedInteger = 0;

        while (num != 0) {
            int rest = num % 10;
            reversedInteger = reversedInteger * 10 + rest;
            num /= 10;
        }

        return reversedInteger;
    }

    public boolean isSameAfterReversals1(int num) {
        return num == 0 ? true : num % 10 != 0;
    }

    public boolean isSameAfterReversals2(int num) {
        return num == 0 || num % 10 != 0;
    }
}
