package collection.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 1200
public class MinimumAbsoluteDifference {
    public static void main(String[] args) {
        System.out.println(minimumAbsDifference(new int[]{4, 2, 1, 3}));
    }

    public static List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(arr);

        int minDiff = arr[arr.length - 1] - arr[0];

        for (int i = 2; i < arr.length; i++) {
            minDiff = Math.min(minDiff, arr[i] - arr[i - 1]);
        }

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] - arr[i] == minDiff) result.add(List.of(arr[i], arr[i + 1]));
        }

        return result;
    }
}
