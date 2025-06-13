package array.easy2;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

// 228
public class SummaryRanges {
    public static void main(String[] args) {

    }

    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        if (nums.length == 0) return result;

        Map<Integer, Integer> rangeMap = new LinkedHashMap<>();
        int start = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1] + 1) {
                rangeMap.put(start, nums[i - 1]);
                start = nums[i];
            }
        }

        rangeMap.put(start, nums[nums.length - 1]);

        for (Map.Entry<Integer, Integer> entry : rangeMap.entrySet()) {
            int rangeStart = entry.getKey();
            int rangeEnd = entry.getValue();
            if (rangeStart == rangeEnd) {
                result.add(String.valueOf(rangeStart));
            } else {
                result.add(rangeStart + "->" + rangeEnd);
            }
        }

        return result;
    }
}
