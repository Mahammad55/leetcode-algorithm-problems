package array.medium;


import java.util.*;

// 229
public class MajorityElement2 {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int count;


        for (int i = 0; i < nums.length; i++) {
            count = 1;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }

            if (count > nums.length / 3) {
                list.add(nums[i]);
            }
        }

        return new LinkedHashSet<>(list).stream().toList();
    }
}
