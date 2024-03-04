package array.easy;

// 896
public class MonotonicArray {
    public static void main(String[] args) {
        System.out.println(isMonotonic(new int[]{1, 3, 22}));
        System.out.println(isMonotonic1(new int[]{1, 3, 62}));
    }

    public static boolean isMonotonic(int[] nums) {
        boolean isFlag = true;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                isFlag = false;
                break;
            }
        }

        if (!isFlag) {
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] < nums[i + 1]) {
                    return false;
                }
            }
        }

        return true;
    }

    public static boolean isMonotonic1(int[] nums) {
        boolean increasing = true;
        boolean decreasing = true;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] > nums[i]) {
                increasing = false;
            }
            if (nums[i - 1] < nums[i]) {
                decreasing = false;
            }
        }
        return increasing || decreasing;
    }
}