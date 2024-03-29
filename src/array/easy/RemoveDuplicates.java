package array.easy;

// 26
public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0)
            return 0;

        int count = 1;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1]) {
                nums[count] = nums[i + 1];
                count++;
            }
        }

        return count;
    }
}
