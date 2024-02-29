package array.easy;

// 643
public class MaxAverageSubArray1 {
    public static void main(String[] args) {
        System.out.println(findMaxAverage(new int[]{-1}, 1));
    }

    public static double findMaxAverage(int[] nums, int k) {
        double max = 0;
        double sum;

        for (int i = 0; i < nums.length - k + 1; i++) {
            sum = 0;
            for (int j = i; j < i + k; j++) {
                sum += nums[j];
            }
            if (i == 0) {
                max = sum / k;
            }

            if (max < sum / k) {
                max = sum / k;
            }
        }

        return max;
    }
}
