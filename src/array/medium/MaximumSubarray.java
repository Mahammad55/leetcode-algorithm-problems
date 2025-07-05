package array.medium;

import java.util.Arrays;

public class MaximumSubarray {
    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{5, 4, -1, 7, 8}));
    }

    public static int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                int sum = getSum(Arrays.copyOfRange(nums, i, j + 1));
                if (max < sum) max = sum;
            }
        }

        return max;
    }

    public static int getSum(int[] nums) {
        return Arrays.stream(nums).sum();
    }

    public static int maxSubArray1(int[] nums) {
        int maxSum = nums[0];
        int currentSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}
