package array.easy;

// 35
public class SearchInsertPosition {
    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{1, 3, 4}, 2));
    }

    public static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int middlePosition = (end + start) / 2;
            int middleElement = nums[middlePosition];

            if (target == middleElement) return middlePosition;
            else if (middleElement > target) end = middlePosition - 1;
            else start = middlePosition + 1;
        }

        return start;
    }
}
