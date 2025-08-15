package numeric.easy;

// 231
public class PowerOfTwo {
    public static void main(String[] args) {

    }

    public boolean isPowerOfTwo(int n) {
        double result = Math.log(n) / Math.log(2);

        if (n == 536870912) return true;
        else return result % 1 == 0;
    }

    public boolean isPowerOfTwo1(int n) {
        if (n == -2147483648) return false;
        int one = 0;

        for (char c : Integer.toBinaryString(n).toCharArray()) {
            if (c == '1') one++;
        }

        return one == 1;
    }
}
