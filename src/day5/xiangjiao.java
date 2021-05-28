package src.day5;

/**
 * 编写一个程序，找到两个单链表相交的起始节点。
 * A+B = B+A 因为相交，所以最后一段相同，所以a，b指针分别走A+B以及B+A，则一定a会=b
 * @author han long yi
 * @create 2021-04-05 23:15
 */
public class xiangjiao {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null){
            return null;
        }
        ListNode a = headA;
        ListNode b = headB;
        while(a != b){
            a = (a==null) ? headB : a.next;
            b = (b==null) ? headA : b.next;
        }
        return a;
    }
    public class ListNode{
        int val;
        ListNode next;
    }
}
