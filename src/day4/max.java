package src.day4;

/**
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 * @author han long yi
 * @create 2021-04-04 10:43
 */
public class max {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int ans = nums[0];
        for(int num : nums){
            if(sum <= 0){
                sum = num;
            }else{
                sum += num;
            }
            //动态规划
            ans = Math.max(sum,ans);
        }
        return ans;
    }
}
