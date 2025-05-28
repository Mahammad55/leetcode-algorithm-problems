package collection.easy;

import java.util.HashMap;
import java.util.Map;

// 141
public class LinkedListCycle {
    public static void main(String[] args) {

    }

    public static boolean hasCycle(ListNode head) {
        Map<ListNode, Boolean> nodeMap = new HashMap<>();
        while (head != null) {
            if (nodeMap.containsKey(head)) return true;
            nodeMap.put(head, true);
            head = head.next;
        }
        return false;
    }

    public static boolean hasCycle1(ListNode head) {
        if (head == null) return false;
        ListNode slow = head, fast = head;
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
            if (fast != null) fast = fast.next;
            if (fast != null && slow == fast) return true;
        }
        return false;
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
