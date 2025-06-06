package collection.medium;

import java.util.Map;
import java.util.TreeMap;

// 729
public class MyCalendar {
    public static void main(String[] args) {

    }

    private TreeMap<Integer, Integer> map;

    public MyCalendar() {
        map = new TreeMap<>();
    }

    public boolean book(int startTime, int endTime) {
        Map.Entry<Integer, Integer> next = map.ceilingEntry(startTime);
        if (next != null && next.getKey() < endTime) return false;

        Map.Entry<Integer, Integer> prev = map.lowerEntry(startTime);
        if (prev != null && prev.getValue() > startTime) return false;

        map.put(startTime, endTime);
        return true;
    }
}
