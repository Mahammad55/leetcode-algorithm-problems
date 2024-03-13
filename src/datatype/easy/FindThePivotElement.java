package datatype.easy;

// 2485
public class FindThePivotElement {
    public static int pivotInteger(int n) {
        for (int i = 1; i <= n; i++) {
            if (sum(1, i) == sum(i, n)) {
                return i;
            }
        }
        return -1;
    }

    public static int sum(int a, int b) {
        int sum = 0;
        for (int i = a; i <= b; i++) {
            sum += i;
        }
        return sum;
    }

    public static int sum1(int num1, int num2) {
        if (num1 == num2) {
            return num1;
        }

        return num1 < num2 ? num1++ + sum1(num1, num2) : num1-- + sum1(num1, num2);
    }
}
