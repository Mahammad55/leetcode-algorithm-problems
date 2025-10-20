package numeric.easy;

// 231
public class PowerOfTwo {
    public static void main(String[] args) {

    }

    public boolean isPowerOfTwo(int n) {
        if (n <= 0) return false;

        double result = Math.log(n) / Math.log(2);
        return result % 1 == 0;
    }

    public boolean isPowerOfTwo1(int n) {
        if (n <= 0) return false;
        int one = 0;

        for (char c : Integer.toBinaryString(n).toCharArray()) {
            if (c == '1') one++;
        }

        return one == 1;
    }

    public boolean isPowerOfTwo2(int n) {
        if (n <= 0) return false;

        long ones = Integer.toBinaryString(n)
                .chars()
                .filter(c -> c == '1')
                .count();

        return ones == 1;
    }

    public boolean isPowerOfTwo3(int n) {
        return n > 0 &&
                Integer.toBinaryString(n).chars().filter(c -> c == '1').count() == 1;
    }
}
