package array.easy;

// 169
public class MajorityElement {
    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{8, 8, 7, 7, 7}));
    }

    public static int majorityElement(int[] nums) {
        int count;

        for (int num1 : nums) {
            count = 0;
            for (int num2 : nums) {
                if (num1 == num2) {
                    count++;
                }
            }

            if (count > nums.length / 2) {
                return num1;
            }
        }

        return -1;
    }
}
