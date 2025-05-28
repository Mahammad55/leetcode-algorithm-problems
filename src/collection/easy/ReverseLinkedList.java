package collection.easy;

// 206
public class ReverseLinkedList {
    public static void main(String[] args) {

    }

    public ListNode reverseList(ListNode head) {
        ListNode previous = null;
        ListNode current = head;
        ListNode node;

        while (current != null) {
            node = current.next;
            current.next = previous;
            previous = current;
            current = node;
        }
        return previous;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
