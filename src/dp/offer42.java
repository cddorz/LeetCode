package src.dp;

/**
 * @author hly
 * @Description: 输入一个整型数组，数组中的一个或连续多个整数组成一个子数组。
 * 求所有子数组的和的最大值。
 * @create 2021-09-01 10:30
 */
public class offer42 {
    public int maxSubArray(int[] nums) {
        int res = nums[0];
        for (int i = 0; i < nums.length; i++) {
            nums[i] += Math.max(nums[i-1],0);
            res = Math.max(nums[i],res);
        }
        return res;
    }
}
