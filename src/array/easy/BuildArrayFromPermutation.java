package array.easy;

public class BuildArrayFromPermutation {
    public static void main(String[] args) {

    }

    public static int[] buildArray(int[] nums) {
        int[] array = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            array[i] = nums[nums[i]];
        }

        return array;
    }
}
