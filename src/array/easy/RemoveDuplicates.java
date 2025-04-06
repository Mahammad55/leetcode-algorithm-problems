package array.easy;

// 26
public class RemoveDuplicates {
    public static void main(String[] args) {
    }

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

    public int removeDuplicates1(int[] nums) {
        int count = 1;
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[count++] = nums[i];
            }
        }

        return count;
    }
}
