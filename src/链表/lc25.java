package src.链表;


/**
 * @author hly
 * @Description: 25. K 个一组翻转链表
 * 给你一个链表，每 k 个节点一组进行翻转，请你返回翻转后的链表。
 * k 是一个正整数，它的值小于或等于链表的长度。
 * @create 2021-09-27 10:45
 */
public class lc25 {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;


        // pre and end 记录翻转 k 个的起始和结束位置
        ListNode pre = dummy;
        ListNode end = dummy;

        while (end.next!=null){
            // 将 end 移动至结束位置
            for (int i = 0; i < k && end != null; i++) {
                end = end.next;
            }
            if(end == null){
                break;
            }
            ListNode start = pre.next;
            // 记录下一组的初始位置
            ListNode next = end.next;
            end.next = null;
            // 翻转链表
            pre.next = reverse(start);
            start.next = next;
            pre = start;
            end = pre;
        }
        return dummy.next;
    }

    private ListNode reverse(ListNode start){
        ListNode pre = null;
        ListNode curr = start;
        while (curr != null){
            ListNode next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        return pre;
    }
}
