package datatype;

// 342
public class PowerOfFour {
    public static void main(String[] args) {
        System.out.println(isPowerOfFour(5));
    }

    public static boolean isPowerOfFour(int n) {
        return (Math.log(n) / Math.log(4)) % 1 == 0;
    }
}
