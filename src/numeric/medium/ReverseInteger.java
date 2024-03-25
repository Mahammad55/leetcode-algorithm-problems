package numeric.medium;

// 7
public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(reverse(1534236469));
    }

    public static int reverse(int x) {
        long reverseNumber = 0;

        while (x != 0) {
            int rest = x % 10;
            reverseNumber = reverseNumber * 10 + rest;
            x /= 10;
        }

        if (reverseNumber > Integer.MAX_VALUE || reverseNumber < Integer.MIN_VALUE) return 0;

        return (int) reverseNumber;
    }
}
