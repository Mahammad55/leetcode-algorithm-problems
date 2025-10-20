package array.easy2;

import java.util.*;
import java.util.stream.Collectors;

// 217
public class ContainsDuplicate {
    public static void main(String[] args) {

    }

    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) return true;
        }
        return false;
    }

    public static boolean containsDuplicate1(int[] nums) {
        int length = nums.length;
        return Arrays.stream(nums)
                .distinct()
                .count() != length;
    }

    public static boolean containsDuplicate2(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (!seen.add(num)) {
                return true;
            }
        }
        return false;
    }

    public static boolean containsDuplicate3(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) return true;
            map.put(num, 1);
        }
        return false;
    }

    public static boolean containsDuplicate4(int[] nums) {
        return Arrays.stream(nums).boxed()
                .collect(Collectors.toSet()).size() < nums.length;
    }

}
