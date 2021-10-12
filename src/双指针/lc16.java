package src.双指针;

import java.util.Arrays;

/**
 * @author hly
 * @Description: TODO
 * @create 2021-10-10 10:36
 */
public class lc16 {
    public static int threeSumClosest(int[] nums, int target) {
        int len = nums.length;
        if (len < 3){
            return 0;
        }

        Arrays.sort(nums);
        int res = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < len - 2; i++) {
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            int left = i + 1;
            int right = len - 1;
            while (left < right){
                int sum = nums[i] + nums[left] + nums[right];
                int temp = sum - target;
                if(temp == 0){
                    return target;
                }
                if(Math.abs(temp) < Math.abs(res - target)){
                    res = sum;
                }
                if( temp > 0){
                    right--;
                }else {
                    left++;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,1,1,0};
        int a = threeSumClosest(nums,100);
        System.out.println(a);
    }
}
