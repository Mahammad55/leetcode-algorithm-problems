package collection.easy;

// 206
public class ReverseLinkedList {
    public static void main(String[] args) {

    }

    public static ListNode reverseList(ListNode head) { // 1 2 3 4 5
        ListNode prev = null;
        ListNode current = head;
        ListNode next;

        while (current != null) {
            next = current.next; // next=2
            current.next = prev; // c.next=null
            prev = current; // prev=1
            current = next; // current=2
        }
        return prev;
    }

    static public class ListNode {
        int val;

        ListNode next;
    }
}
