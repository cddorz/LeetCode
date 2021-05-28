package src.day12;

/**
 * 给你链表的头结点 head ，请将其按 升序 排列并返回 排序后的链表 。
 * 归并排序(先分割中点，在比较归并)
 * @author han long yi
 * @create 2021-04-16 8:45
 */
public class sortList {
    public class ListNode{
        int val;
        ListNode next;
        ListNode(int val){ this.val = val;}
    }
    public ListNode sortList(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        //通过快慢指针记录中点
        if(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode temp = slow.next;
        //cut分割
        slow.next = null;
        ListNode left = sortList(head);
        ListNode right = sortList(temp);
        //辅助头节点
        ListNode h = new ListNode(0);
        ListNode res = h;
        //归并
        while (left != null && right != null){
            if(left.val < right.val){
                h.next = left;
                left = left.next;
            }else{
                h.next = right;
                right = right.next;
            }
            h = h.next;
        }
        //数组总长度为奇数，需要此行代码
        h.next = left !=null ? left : right;
        return res.next;
    }
}
