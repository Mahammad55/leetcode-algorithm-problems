package numeric.easy;

// 405
public class ConvertNumberHexadecimal {
    public static void main(String[] args) {
        System.out.println(toHex(-1));
    }

    public static String toHex(int num) {
        return Integer.toHexString(num);
    }
}
