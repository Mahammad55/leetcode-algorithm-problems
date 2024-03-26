package array.medium;

import java.util.Arrays;

// 238
public class ProductOfArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(productExceptSelf1(new int[]{2, 3, 4, 5})));
    }

    public static int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = multiply(nums, i);
        }
        return result;
    }

    private static int multiply(int[] array, int expectIndex) {
        int result = 1;
        for (int i = 0; i < array.length; i++) {
            if (i != expectIndex) result *= array[i];
        }
        return result;
    }

    public static int[] productExceptSelf1(int[] nums) {
        int length = nums.length;
        int[] prefix = new int[length];
        int[] suffix = new int[length];
        int[] result = new int[length];

        prefix[0] = 1;
        for (int i = 1; i < length; i++) {
            prefix[i] = prefix[i - 1] * nums[i - 1];
        }

        suffix[length - 1] = 1;
        for (int i = length - 2; i >= 0; i--) {
            suffix[i] = suffix[i + 1] * nums[i + 1];
        }

        for (int i = 0; i < length; i++) {
            result[i] = prefix[i] * suffix[i];
        }

        return result;
    }
}
