package src.day13;



/**
 * 给定一个整数数组和一个整数 k，你需要找到该数组中和为 k 的连续的子数组的个数。
 * 利用前缀和数组解题
 * @author han long yi
 * @create 2021-04-17 21:36
 */
public class lc560 {
    public int subarraySum(int[] nums,int k){
        int len = nums.length;
        int[] preSum = new int[len+1];
        preSum[0] = 0;
        //计算前缀和数组
        for(int i = 0; i < len;i++){
            preSum[i+1] = preSum[i] + nums[i];
        }

        int count = 0;
        for(int left = 0; left < len;left++){
            for(int right = left; right < len;right++){
                //区间[left,right]
                if(preSum[right+1] - preSum[left] == k){
                    count++;
                }
            }
        }
        return count;
    }
}
