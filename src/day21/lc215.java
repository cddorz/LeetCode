package src.day21;
import java.util.Arrays;

/**
 * @author hly
 * @Description: TODO
 * @create 2021-09-16 10:05
 */
public class lc215 {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        int res = 0;
        for (int i = nums.length - 1; i >= 0 ; i--) {
            if(nums.length - k == i){
                res = nums[i];
                break;
            }
        }
        return res;
    }
}
