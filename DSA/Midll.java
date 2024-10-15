public class Midll {
    public static ListNode findMiddle(ListNode head) {
        ListNode slow_ptr = head;
        ListNode fast_ptr = head;
    
        while (fast_ptr != null && fast_ptr.next != null) {
            slow_ptr = slow_ptr.next;
            fast_ptr = fast_ptr.next.next;
        }
    
        return slow_ptr;
    }
    
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        ListNode middle = findMiddle(head);
        System.out.println("The middle value is: " + middle.value);
    }
}
class ListNode {
    int value;
    ListNode next;

    ListNode(int value) {
        this.value = value;
        this.next = null;
    }
}