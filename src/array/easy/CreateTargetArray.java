package array.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 1389
public class CreateTargetArray {
    public static void main(String[] args) {
        int[] targetArray = createTargetArray(new int[]{1, 2, 3, 4, 0}, new int[]{0, 1, 2, 3, 0});
        System.out.println(Arrays.toString(targetArray));
    }

    public static int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length - 1; j > index[i]; j--) {
                target[j] = target[j - 1];
            }
            target[index[i]] = nums[i];
        }

        return target;
    }

    public static int[] createTargetArray1(int[] nums, int[] index) {
        int[] target = new int[nums.length];
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            list.add(index[i], nums[i]);
        }
        for (int i = 0; i < nums.length; i++) {
            target[i] = list.get(i);
        }

        return target;
    }
}
/*
     [0,0,0,0,0]
     [0,1,0,0,0]
     [0,1,2,0,0]
     [0,1,3,2,0]
     [0,4,1,3,2]
 */
