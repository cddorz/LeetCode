package src.day15;


/**
 * 19. 删除链表的倒数第 N 个结点
 * @author hly
 * @Description: 给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。
 * 双指针法,建议配合着图进行理解
 * @create 2021-04-19 19:36
 */
public class lc19 {
    public class ListNode{
        int val;
        ListNode next;
        ListNode(int val){ this.val = val;}
        ListNode(int val,ListNode next){this.val = val; this.next = next;}
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        //新建一个链表
        ListNode node = new ListNode(0, head);
        ListNode fast = head;
        ListNode slow = node;
        //fast指针领先slow  n个位置
        //fast遍历到尾部，slow刚好指向倒数第n个
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        while (fast != null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        ListNode res = node.next;
        return res;
    }
}
