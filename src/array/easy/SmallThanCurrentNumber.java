package array.easy;

import java.util.Arrays;

// 1365
public class SmallThanCurrentNumber {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(new int[]{8, 1, 2, 2, 3})));
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] smallNumbersCount = new int[nums.length];
        int count;

        for (int i = 0; i < nums.length; i++) {
            count = 0;
            for (int num : nums) {
                if (nums[i] > num) {
                    count++;
                }
            }
            smallNumbersCount[i] = count;
        }
        return smallNumbersCount;
    }
}
