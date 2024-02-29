package array.easy;

import java.util.Arrays;

// 1929
public class ConcatenationOfArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getConcatenation(new int[]{1, 2, 3})));
    }

    public static int[] getConcatenation(int[] nums) {
        int[] newArray = new int[nums.length * 2];
        int index = 0;

        for (int j = 0; j < 2; j++) {
            for (int num : nums) {
                newArray[index++] = num;
            }
        }
        return newArray;
    }

    public static int[] getConcatenation1(int[] nums) {
        int[] newArray = new int[nums.length * 2];

        for (int i = 0; i < nums.length; i++) {
            newArray[i] = nums[i];
            newArray[i + nums.length] = nums[i];
        }
        return newArray;
    }
}
