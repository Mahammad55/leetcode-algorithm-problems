package array.medium;

import java.util.Arrays;

// 75
public class SortColors {
    public static void main(String[] args) {
        int[] array = {2, 1, 3, 0, 0, 3, 1, 2};
        sortColors1(array);
        System.out.println(Arrays.toString(array));
    }

    public static void sortColors(int[] nums) {
        Arrays.sort(nums);
    }

    public static void sortColors1(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
    }
}
