package numeric.easy;

// 258
public class AddDigits {
    public static void main(String[] args) {
        System.out.println(addDigits(38));
    }

    public static int addDigits(int num) {
        while (num >= 10) {
            num = sumAndReturn(num);
        }
        return num;
    }

    private static int sumAndReturn(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
