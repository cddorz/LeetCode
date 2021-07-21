package src.day19;

import java.awt.*;

/**
 * @author hly
 * @Description: 在指定范围内反转链表
 * @create 2021-07-21 11:50
 */
public class lc92 {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

  public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode newhead = new ListNode(0);
        newhead.next = head;
        // 初始化指针
        ListNode pre = newhead;
        ListNode last = newhead.next;
        // 使 pre 到需要反转的前一个，last 到需要反转的位置
        for (int i = 0; i < left - 1; i++) {
            pre = pre.next;
            last = last.next;
        }
        // 头插法
        for (int i = 0; i < right - left;i++){
            ListNode removed = last.next;
            last.next = last.next.next;

            removed.next = pre.next;
            pre.next = removed;

        }
        return  newhead.next;
  }
}
