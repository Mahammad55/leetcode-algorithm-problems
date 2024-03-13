package collection.easy;

import java.util.List;
import java.util.Map;

// 1773
public class CountOfItemsMatching {
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int index = 0;
        int count = 0;

        switch (ruleKey) {
            case "type" -> index = 0;
            case "color" -> index = 1;
            case "name" -> index = 2;
        }

        for (List<String> list : items) {
            if (list.get(index).equals(ruleValue)) {
                count++;
            }
        }

        return count;
    }

    public static int countMatches1(List<List<String>> items, String ruleKey, String ruleValue) {
        Map<String, Integer> map = Map.of("type", 0, "color", 1, "name", 2);
        int count = 0;
        Integer  index = map.get(ruleKey);

        for (List<String> list : items) {
            if (list.get(index).equals(ruleValue)) count++;
        }

        return count;
    }
}
