package collection.medium;

import java.util.ArrayList;
import java.util.List;

// 78
public class Subsets {
    public static void main(String[] args) {
        System.out.println(subsets(new int[]{1, 2, 3}));
    }

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<>();
        generateSubsets(nums, 0, new ArrayList<>(), subsets);
        return subsets;
    }

    private static void generateSubsets(int[] nums, int index, List<Integer> currentSubset, List<List<Integer>> subsets) {
        subsets.add(new ArrayList<>(currentSubset));
        System.out.println(currentSubset);
        System.out.println(subsets);

        for (int i = index; i < nums.length; i++) {
            currentSubset.add(nums[i]);
            generateSubsets(nums, i + 1, currentSubset, subsets);
            currentSubset.remove(currentSubset.size() - 1);
        }
    }
}
