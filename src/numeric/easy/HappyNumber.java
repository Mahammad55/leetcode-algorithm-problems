package numeric.easy;

// 202
public class HappyNumber {
    public boolean isHappy(int number) {
        while (number != 1 && number != 4) {
            number = sum(number);
        }

        return number == 1;
    }

    private static int sum(int number) {
        int sum = 0;

        while (number != 0) {
            int rest = number % 10;
            sum += rest * rest;
            number /= 10;
        }

        return sum;
    }
}
