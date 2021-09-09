package src.数组;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author hly
 * @Description: 三数之和
 * 给你一个包含 n 个整数的数组nums，判断nums中是否存在三个元素 a，b，c
 * 使得a + b + c = 0 ？请你找出所有和为 0 且不重复的三元组。
 * @create 2021-08-31 9:29
 */
public class lc15 {
    /**
     * solution:
     * 先排序，定位nums[0]
     * 之后去重讨论
     * @param nums
     * @return
     */
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int len = nums.length;
        if(nums == null || len < 3){
            return ans;
        }
        // 排序
        Arrays.sort(nums);
        for (int i = 0; i < len; i++) {
            // nums[0] > 0,则不可能 sun == 0
            if(nums[i] > 0) {
                break;
            }
            // 去重
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            // 双指针定位 i 后面的两端，双指针进行遍历
            int L = i + 1;
            int R = len - 1;
            while (L < R){
                int sum = nums[i] + nums[L] + nums[R];
                if(sum == 0){
                    ans.add(Arrays.asList(nums[i],nums[L],nums[R]));
                    while (L<R && nums[L] == nums[L+1]) {
                        L++; // 去重
                    }
                    while (L<R && nums[R] == nums[R-1]) {
                        R--; // 去重
                    }
                    L++;
                    R--;
                }
                else if (sum < 0) L++;
                else if (sum > 0) R--;
            }
        }
        return ans;
    }
}
