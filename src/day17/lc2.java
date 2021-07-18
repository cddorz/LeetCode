package src.day17;

/**
 * @author hly
 * @Description: TODO
 * @create 2021-07-13 11:13
 */
public class lc2 {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = l1;
        if(l1.val == 0 && l2.val == 0){
            return res;
        }
        sum(l1,l2,res);
        l1 = l1.next;
        l2 = l2.next;

        sum(l1,l2,res);
        l1 = l1.next;
        l2 = l2.next;

        sum(l1,l2,res);

        return res;
    }

    public static ListNode sum(ListNode l1,ListNode l2,ListNode res){
        if((l1.val + l2.val) > 10){
            res.val = (l1.val + l2.val) % 10;
            res = res.next;
            res.val += 1;
            return res;
        }
        res.val = (l1.val + l2.val);
        res = res.next;
        return res;
    }
}
