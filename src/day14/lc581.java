package src.day14;


import java.util.Arrays;
import java.util.Stack;

/**
 * 给你一个整数数组 nums ，你需要找出一个 连续子数组 ，如果对这个子数组进行升序排序，那么整个数组都会变为升序排序。
 * 请你找出符合题意的 最短 子数组，并输出它的长度。
 * 想法是：我们将数组 nums进行排序，记为 num\_sorted
 * 然后我们比较 nums 和 nums_sorted 的元素来决定最左边和最右边不匹配的元素。
 * 它们之间的子数组就是要求的最短无序子数组。
 * @author han long yi
 * @create 2021-04-18 10:42
 */
public class lc581 {
    /**
     * 解法一：数组排序，时间复杂度为O(nlogn)
     * @param nums
     * @return
     */
    public int findUnsortedSubarry(int[] nums){
        int[] clone = nums.clone();
        //对clone数组排序，与原数组比较
        Arrays.sort(clone);
        int start = nums.length, end = 0;
        for(int i = 0; i < nums.length; i++){
            //比较，不一样的记录位置
            if(clone[i] != nums[i]){
                //start是左区间，end为右区间
                start = Math.min(start,i);
                end = Math.max(end,i);
            }
        }
        return (end - start > 0 ? end - start + 1 : 0);
    }

    /**
     * 解法二：利用栈空间，先顺序遍历数组，如果为顺序就持续压栈，遇到 nums[j] 比栈顶元素小，那么弹栈，比较得左边界
     * 逆序如此得有边界
     * 时间复杂度为O(n)
     * @param nums
     * @return
     */
    public int findUnsortedSubarray(int[] nums) {
        Stack< Integer > stack = new Stack < Integer > ();
        int l = nums.length, r = 0;
        for (int i = 0; i < nums.length; i++) {
            while (!stack.isEmpty() && nums[stack.peek()] > nums[i]) {
                l = Math.min(l, stack.pop());
            }
            stack.push(i);
        }
        stack.clear();
        for (int i = nums.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && nums[stack.peek()] < nums[i]) {
                r = Math.max(r, stack.pop());
            }
            stack.push(i);
        }
        return r - l > 0 ? r - l + 1 : 0;
    }

}
