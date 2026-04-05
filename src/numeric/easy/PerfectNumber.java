package numeric.easy;

import java.util.stream.IntStream;

// 507
public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println(checkPerfectNumber(6));
        System.out.println(checkPerfectNumber(8));
    }

    // A perfect number is a positive integer that is equal to the sum of its positive divisors, excluding the number itself.
    // 6 is a perfect number because its positive divisors are 1, 2, and 3, and 1 + 2 + 3 = 6.
    // 8 is not a perfect number because its positive divisors are 1, 2, and 4, and 1 + 2 + 4 = 7.
    public static boolean checkPerfectNumber(int num) {
        if (num <= 1) {
            return false;
        }

        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        return sum == num;
    }

    public static boolean checkPerfectNumber1(int num) {
        if (num <= 1) {
            return false;
        }

        int sum = 1;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        return sum == num;
    }

    public static boolean checkPerfectNumber2(int num) {
        if (num <= 1) {
            return false;
        }

        return IntStream.range(1, num)
                .filter(i -> num % i == 0)
                .sum() == num;
    }

    public static boolean checkPerfectNumber3(int num) {
        if (num <= 1) return false;

        int sum = 1;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                sum += i;
                if (sum > num) return false;
            }
        }

        return sum == num;
    }
}
