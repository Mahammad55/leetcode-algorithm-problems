package numeric.easy;

// 1137
public class TribonacciNumber {
    public static void main(String[] args) {
        System.out.println(tribonacci(25));
        System.out.println(tribonacci1(25));
        System.out.println(tribonacci2(25));
    }

    public static int tribonacci(int n) {
        int n1 = 0, n2 = 1, n3 = 1, result = n == 0 ? 0 : 1;

        for (int i = 3; i <= n; ++i) {
            result = n1 + n2 + n3;
            n1 = n2;
            n2 = n3;
            n3 = result;
        }

        return result;
    }

    public static int tribonacci1(int n) {
        if (n == 0) return 0;
        if (n == 1 || n == 2) return 1;
        return tribonacci1(n - 1) + tribonacci1(n - 2) + tribonacci1(n - 3);
    }

    static int max = 38;
    static int[] arr = new int[max];
    public static int tribonacci2(int n) {
        if (n == 0) return 0;
        if (n == 1 || n == 2) return 1;
        if (arr[n] != 0) return arr[n];
        return arr[n]=tribonacci2(n - 1) + tribonacci2(n - 2) + tribonacci2(n - 3);
    }
}
