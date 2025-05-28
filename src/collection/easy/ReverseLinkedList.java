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

    public ListNode reverseList1(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode previous = null;
        ListNode node = head.next;

        while (node != null) {
            head.next = previous;
            previous = head;
            head = node;
            node = node.next;
        }
        head.next = previous;
        return head;
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
