package numeric.easy;

// 70
public class ClimbingStairs {
    public static void main(String[] args) {
        System.out.println(climbStairs2(2));
    }

    public static int climbStairs(int n) { // O(2^n)
        if (n <= 1) return 1;
        return climbStairs(n - 1) + climbStairs(n - 2);
    }

    final int max = 46;
    int[] arr = new int[max];

    public int climbStairs1(int n) { // O(n) -> Memoization
        if (n <= 1) return 1;
        if (arr[n] != 0) return arr[n];
        return arr[n] = climbStairs1(n - 1) + climbStairs1(n - 2);
    }

    public static int climbStairs2(int n) { // O(n) -> Tabulation  memory O(n)
        int[] array = new int[46];
        array[0] = array[1] = 1;

        for (int i = 2; i <= n; ++i) {
            array[i] = array[i - 1] + array[i - 2];
        }

        return array[n];
    }

    public static int climbStairs3(int n) { // O(n) -> Tabulation  memory O(1)
        int a = 1, b = 1, c=1;
        for (int i = 2; i <= n; ++i) {
            c = a + b;
            a = b;
            b = c;
        }

        return c;
    }
}
