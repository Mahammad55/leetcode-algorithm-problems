package numeric.easy;

// 342
public class PowerOfFour {
    public static void main(String[] args) {
        System.out.println(isPowerOfFour(5));
    }

    public static boolean isPowerOfFour(int n) {
        return (Math.log(n) / Math.log(4)) % 1 == 0;
    }

    public static boolean isPowerOfFour1(int n) {
        if (n <= 0) {
            return false;
        }
        double logValue = Math.log(n) / Math.log(4);
        return Math.floor(logValue) == logValue;
    }

    public static boolean isPowerOfFour2(int n) {
        int one = 0, zero = 0;

        for (char c : Integer.toBinaryString(n).toCharArray()) {
            if (c == '0') zero++;
            else one++;
        }

        return one == 1 && zero % 2 == 0;
    }
}
