package src.双指针;

import java.util.List;

/**
 * @author hly
 * @Description: TODO
 * @create 2021-10-09 18:48
 */
public class lc143 {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public  void reorderList(ListNode head) {
        if(head == null){
            return;
        }
        ListNode mid = middleNode(head);
        ListNode l1 = head;
        ListNode l2 = mid.next;
        mid.next = null;
        l2 = reverseListNode(l2);
        merge(l1,l2);
    }

    private ListNode middleNode(ListNode head){
        ListNode fast = head;
        ListNode slow = head;
        while (fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private ListNode reverseListNode(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null){
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;
    }

    private void merge(ListNode l1,ListNode l2){
        ListNode l1_temp = l1;
        ListNode l2_temp = l2;
        while (l1 != null && l2!= null){
            l1_temp = l1.next;
            l2_temp = l2.next;

            l1.next = l2;
            l1 = l1_temp;

            l2.next = l1;
            l2 = l2_temp;
        }
    }
}
