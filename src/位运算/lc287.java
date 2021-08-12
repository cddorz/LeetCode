package src.位运算;

/**
 * @author hly
 * @Description: 给定一个包含 n + 1 个整数的数组 nums ，其数字都在 1 到 n 之间（包括 1 和 n）
 * 可知至少存在一个重复的整数。你设计的解决方案必须不修改数组 nums 且只用常量级 O(1) 的额外空间。
 * @create 2021-08-12 11:48
 */
public class lc287 {
    /**
     * 模拟环形链表
     */
    public int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[nums[0]];
        while(slow != fast){
            slow = nums[slow];
            fast = nums[nums[fast]];
        }
        slow = 0;
        while (slow != fast){
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
}
