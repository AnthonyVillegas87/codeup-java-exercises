package patterns.fast_slow_pointers;

public class MiddleOfLinkedList {


    /*
    Given the head of a Singly LinkedList, write a method to return the middle node of the LinkedList.

    If the total number of nodes in the LinkedList is even, return the second middle node.

    We can use the Fast & Slow pointers method such that the fast pointer is always twice the nodes ahead of the slow pointer.
    This way, when the fast pointer reaches the end of the LinkedList, the slow pointer will be pointing at the middle node.
     */
    public static ListNode findMiddle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        System.out.println("Middle Node: " + MiddleOfLinkedList.findMiddle(head).value);

        head.next.next.next.next.next = new ListNode(6);
        System.out.println("Middle Node: " + MiddleOfLinkedList.findMiddle(head).value);

        head.next.next.next.next.next.next = new ListNode(7);
        System.out.println("Middle Node: " + MiddleOfLinkedList.findMiddle(head).value);
    }

}
