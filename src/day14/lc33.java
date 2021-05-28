package src.day14;

/**
 * 搜索旋转排序数组
 * 输入：nums = [4,5,6,7,0,1,2], target = 0
 * 输出：4
 * 升级版二分法
 * @author han long yi
 * @create 2021-04-18 22:39
 */
public class lc33 {
    public int search(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        int mid = 0;
        while (l <= r){
            mid = l + (r - l) / 2;
            if(nums[mid] == target){
                return mid;
            }
            //先判断mid属于前半部分，还是后半部分
            //因为这不是升序数组，不能直接二分
            if(nums[mid] >= nums[l]){
                //二分法
                if(target >= nums[l] && target < nums[mid]){
                    r = mid - 1;
                }else {
                    l = mid + 1;
                }
            }else {
                if(target > nums[mid] && target <= nums[r]){
                    l = mid + 1;
                }else {
                    r = mid - 1;
                }
            }
        }
        return -1;
    }
}
