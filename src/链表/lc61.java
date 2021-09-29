package src.链表;

/**
 * @author hly
 * @Description: 给你一个链表的头节点 head ，旋转链表，将链表每个节点向右移动 k 个位置。
 * @create 2021-09-29 19:15
 */
public class lc61 {
    public class ListNode{
        int val;
        ListNode next;
        ListNode(){}
        ListNode(int val){
            this.val = val;
        }
    }
    public ListNode rotateRight(ListNode head, int k) {
        if (k == 0 || head == null || head.next == null) {
            return head;
        }
        ListNode tail = head;
        int n = 1;
        // 链表成环
        while(tail.next != null){
            tail = tail.next;
            n++;
        }
        // a 为旋转后的最末位置的索引
        int a = n - k % n;
        if(a == n){
            return head;
        }
        tail.next = head;
        while(a-- > 0){
            tail = tail.next;
        }
        // 解环
        ListNode h = tail.next;
        tail.next = null;
        return h;
    }
}
