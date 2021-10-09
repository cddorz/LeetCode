package src.双指针;

/**
 * @author hly
 * @Description: 给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。
 * @create 2021-10-07 10:32
 */
public class lc27 {
    public int removeElement(int[] nums, int val) {
        int len = nums.length;
        int left = 0;
        for(int right = 0; right < len; right++){
            if(nums[right] != val){
                nums[left] = nums[right];
                left++;
            }
        }
        return left;
    }
}
