package numeric.easy;

// 367
public class ValidPerfectSquare {
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(16));
    }

    public static boolean isPerfectSquare(int num) {
        return Math.sqrt(num) % 1 == 0;
    }
}
