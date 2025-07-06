package array.easy2;

// 2016
public class MaximumDifferenceBetweenIncreasingElements {
    public static void main(String[] args) {

    }

    public static int maximumDifference(int[] nums) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int diff = nums[j] - nums[i];
                if (j > i && nums[i] < nums[j] && diff > max) max = diff;
            }
        }

        return max == Integer.MIN_VALUE ? -1 : max;
    }

    public static int maximumDifference1(int[] nums) {
        int minVal = nums[0];
        int maxDiff = -1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > minVal) {
                maxDiff = Math.max(maxDiff, nums[i] - minVal);
            } else {
                minVal = nums[i];
            }
        }

        return maxDiff;
    }
}
