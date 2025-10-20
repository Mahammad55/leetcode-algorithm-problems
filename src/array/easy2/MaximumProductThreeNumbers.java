package array.easy2;

import java.util.Arrays;

// 628
public class MaximumProductThreeNumbers {
    public static void main(String[] args) {
        System.out.println(maximumProduct(new int[]{3, 4, 0, 0, -1, -5}));
    }

    public static int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int first = nums[0] * nums[1] * nums[2];
        int second = nums[n - 1] * nums[n - 2] * nums[n - 3];
        int third = nums[0] * nums[1] * nums[n - 1];
        int fourth = nums[0] * nums[n - 2] * nums[n - 1];
        return Math.max(Math.max(first, second), Math.max(third, fourth));
    }

    public static int maximumProduct1(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;

        int product1 = nums[n - 1] * nums[n - 2] * nums[n - 3]; // 3 ən böyük
        int product2 = nums[0] * nums[1] * nums[n - 1];         // 2 ən kiçik * ən böyük

        return Math.max(product1, product2);
    }
}
