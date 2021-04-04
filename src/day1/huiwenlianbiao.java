package src.day1;

/**
 * 回文链表：1->2->2->1 true
 * 通过pre 和 prepre指针来反转链表
 * fast指针走完，slow到一半
 * 只是破坏了链表的结构
 * @author han long yi
 * @create 2021-04-01 20:38
 */
public class huiwenlianbiao {
    /**
     * 结构体链表
     */
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public boolean isPalindrome(ListNode head) {
        if(head==null&&head.next==null){
            return true;
        }
        //prepre pre 用来反转链表
        ListNode slow=head,fast=head;
        ListNode pre=head,prepre=null;
        while(fast != null && fast.next != null){
            pre = slow;
            slow = slow.next;
            fast = fast.next.next;
            pre.next = prepre;
            prepre = pre;
        }
        if(fast!=null){
            slow = slow.next;
        }
        while(pre!=null&&slow!=null){
            if(slow.val!=pre.val){
                return false;
            }
            pre=pre.next;
            slow=slow.next;
        }
        return true;
    }
}
