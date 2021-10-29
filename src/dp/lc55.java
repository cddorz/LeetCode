package src.dp;

/**
 * @author hly
 * @Description: 给定一个非负整数数组 nums ，你最初位于数组的 第一个下标 。
 * 数组中的每个元素代表你在该位置可以跳跃的最大长度。
 * 判断你是否能够到达最后一个下标。
 * @create 2021-10-17 11:02
 */
public class lc55 {
    public boolean canJump(int[] nums) {
        int maxStep = nums[0];
        int len = nums.length;
        for(int i = 0; i <= maxStep && i < len; i++){
            maxStep = Math.max(maxStep, i + nums[i]);
        }
        return maxStep >= len - 1;
    }
}
