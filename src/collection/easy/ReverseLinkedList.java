package collection.easy;

// 206
public class ReverseLinkedList {
    public static void main(String[] args) {

    }

//    public ListNode reverseList(ListNode head) {
//        ListNode previous = null;
//    public static ListNode reverseList(ListNode head) { // 1 2 3 4 5
//        ListNode prev = null;
//        ListNode current = head;
//        ListNode node;
//        ListNode next;
//
//        while (current != null) {
//            node = current.next;
//            current.next = previous;
//            previous = current;
//            current = node;
//        }
//        return previous;
//    }
//
//    public ListNode reverseList1(ListNode head) {
//        if (head == null || head.next == null) return head;
//        ListNode previous = null;
//        ListNode node = head.next;
//
//        while (node != null) {
//            head.next = previous;
//            previous = head;
//            head = node;
//            node = node.next;
//            next = current.next; // next=2
//            current.next = prev; // c.next=null
//            prev = current; // prev=1
//            current = next; // current=2
//        }
//        return prev;
//    }
//
//    static class ListNode {
//        int val;
//
//        ListNode next;
//
//        ListNode() {
//        }
//
//        ListNode(int val) {
//            this.val = val;
//        }
//
//        ListNode(int val, ListNode next) {
//            this.val = val;
//            this.next = next;
//        }
//    }
}
