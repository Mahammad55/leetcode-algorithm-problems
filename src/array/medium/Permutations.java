package array.medium;

import java.util.ArrayList;
import java.util.List;

// 46
public class Permutations {
    public static void main(String[] args) {
        System.out.println(permute(new int[]{1, 2, 3, 4}));
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> permutations = new ArrayList<>();
        int permutationCount = calculateFactorial(nums.length);
        return permutations;
    }

    private static int calculateFactorial(int number) {
        if (number == 1) return 1;
        return number * calculateFactorial(number - 1);
    }
}
