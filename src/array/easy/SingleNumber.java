package array.easy;

// 136
public class SingleNumber {
    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{2, 2, 1}));
    }

    public static int singleNumber(int[] nums) {
        int count = 0;
        for (int num1 : nums) {
            for (int num2 : nums) {
                if (num1 == num2) count++;
            }
            if (count == 1) return num1;
            else count = 0;
        }
        return 0;
    }
}
