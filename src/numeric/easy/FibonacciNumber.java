package numeric.easy;

// 509
public class FibonacciNumber {
    public static void main(String[] args) {
        System.out.println(fib(2));
        System.out.println(fib(3));
        System.out.println(fib(4));
    }

    // The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,
    // F(0) = 0, F(1) = 1
    // F(n) = F(n - 1) + F(n - 2), for n > 1.
    public static int fib1(int n) {
        if (n == 1) return 1;
        int sum = 0;
        int a = 0;
        int b = 1;

        for (int i = 2; i <= n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }

        return sum;
    }

    public static int fib(int n) {
        if (n <= 1) return n;
        return fib(n - 1) + fib(n - 2);
    }

    public static int fib2(int n) {
        if (n <= 1) return n;

        int a = 0, b = 1;

        for (int i = 2; i <= n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }

        return b;
    }
}
