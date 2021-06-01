package src.day5;

/**
 * 给定一个链表，判断链表中是否有环。
 * 解法：快慢指针，快指针先进入环，如果快指针追上慢指针，证明有环
 * @author han long yi
 * @create 2021-04-05 14:51
 */
public class cycle {
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null){
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while(slow != fast){
            if(fast == null || fast.next == null){
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }
    public class ListNode{
        int val;
        ListNode next;
    }
}
