package array.medium;

import java.util.Arrays;

// 416
public class PartitionEqualSubsetSum {
    public static void main(String[] args) {
        System.out.println(canPartition(new int[]{1, 5, 11, 5}));
    }

    public static boolean canPartition(int[] nums) {
        int sum = Arrays.stream(nums).sum();
        if (sum % 2 != 0) return false;

        sum /= 2;
        boolean[] isPossible = new boolean[sum + 1];
        isPossible[0] = true;

        for (int i : nums) {
            for (int j = sum - i; j >= 0; j--) {
                if (isPossible[j]) isPossible[j + i] = true;
            }
        }

        return isPossible[sum];
    }
}
