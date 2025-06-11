package numeric.easy;

// 263
public class UglyNumber {
    public static void main(String[] args) {

    }

    public static boolean isUgly(int n) {
        if (n <= 0) return false;
        if (n == 1) return true;

        int[] primes = {2, 3, 5};
        for (int prime : primes) {
            while (n % prime == 0) {
                n /= prime;
            }
        }
        return n == 1;
    }
}
