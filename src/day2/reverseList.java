package src.day2;

/**
 * 递归实现反转链表
 * @author han long yi
 * @create 2021-04-02 23:00
 */
public class reverseList {
    public class ListNode {
        int val;
        ListNode next;
     }
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }
        ListNode newhead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newhead;
    }
}
