package numeric.medium;

import java.util.Arrays;

// 179
public class LargestNumber {
    public static void main(String[] args) {
        System.out.println(largestNumber(new int[]{3, 30, 34, 5, 9}));
    }


    public static String largestNumber(int[] nums) {
        String result = Arrays.stream(nums)
                .boxed()
                .map(String::valueOf)
                .sorted((a, b) -> (b + a).compareTo(a + b))
                .reduce((a, b) -> a.equals("0") && b.equals("0") ? "0" : a + b)
                .orElse("0");

        return result.startsWith("0") ? "0" : result;
    }
}
