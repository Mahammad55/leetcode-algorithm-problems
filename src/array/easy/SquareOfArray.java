package array.easy;

import java.util.Arrays;

// 977
public class SquareOfArray {
    public int[] sortedSquares(int[] nums) {
        return Arrays
                .stream(nums)
                .map(num -> num * num)
                .sorted()
                .toArray();
    }
}
