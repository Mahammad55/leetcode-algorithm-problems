package array.easy;

// 2441
public class LargestPositiveInteger {
    public static void main(String[] args) {
        System.out.println(findMaxK(new int[]{-1, 10, 6, 7, 7, 1}));
    }

    public static int findMaxK(int[] nums) {
        int maxElement = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == -nums[j] && nums[i] > maxElement) {
                    maxElement = nums[i];
                    break;
                } else if (nums[i] == -nums[j] && -nums[i] > maxElement) {
                    maxElement = nums[i];
                    break;
                }
            }

            if (maxElement < 0) {
                maxElement = -maxElement;
            }
        }

        return maxElement == 0 ? -1 : maxElement;
    }
}
