package array.easy;

import java.util.HashMap;
import java.util.Map;

// 169
public class MajorityElement {
    public static void main(String[] args) {
        System.out.println(majorityElement3(new int[]{8, 8, 7, 7, 7}));
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

    public static int majorityElement1(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            if (!map.containsKey(num)) {
                map.put(num, 1);
            } else {
                map.put(num, map.get(num) + 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > nums.length / 2) {
                return entry.getKey();
            }
        }

        return -1;
    }

    public static int majorityElement2(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > nums.length / 2) {
                return entry.getKey();
            }
        }

        return -1;
    }

    public static int majorityElement3(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            int count = map.getOrDefault(num, 0) + 1;
            if (count > nums.length / 2) return num;
            map.put(num, count);
        }

        return -1;
    }
}
