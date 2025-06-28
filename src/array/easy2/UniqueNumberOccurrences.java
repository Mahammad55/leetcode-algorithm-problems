package array.easy2;

import java.util.*;
import java.util.stream.Collectors;

// 1207
public class UniqueNumberOccurrences {
    public static void main(String[] args) {
        System.out.println(uniqueOccurrences(new int[]{1, 2, 2, 1, 1, 3}));
        System.out.println(uniqueOccurrences(new int[]{1, 2}));
    }

    public static boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Long> collect = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(element -> element, Collectors.counting()));

        List<Long> longs = new ArrayList<>();
        for (Map.Entry<Integer, Long> integerLongEntry : collect.entrySet()) {
            longs.add(integerLongEntry.getValue());
        }

        return longs.size() == new HashSet<>(longs).size();
    }

    public static boolean uniqueOccurrences1(int[] arr) {
        Map<Integer, Long> freqMap = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()));

        return freqMap.size() == new HashSet<>(freqMap.values()).size();
    }

    public static boolean uniqueOccurrences3(int[] arr) {
        return Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .values()
                .stream()
                .collect(Collectors.toSet())
                .size()
                ==
                Arrays.stream(arr)
                        .boxed()
                        .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                        .size();
    }
}
