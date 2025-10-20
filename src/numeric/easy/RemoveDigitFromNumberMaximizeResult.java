package numeric.easy;

// 2259
public class RemoveDigitFromNumberMaximizeResult {
    public static void main(String[] args) {
        System.out.println(removeDigit("1231", '1'));
    }

    public static String removeDigit(String number, char digit) {
        String maxNumber = "";

        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) == digit) {
                String newNumber = number.substring(0, i) + number.substring(i + 1);
                if (maxNumber.compareTo(newNumber) < 0) maxNumber = newNumber;
            }
        }

        return maxNumber;
    }
}
