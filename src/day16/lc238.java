package src.day16;

/**
 * 238. 除自身以外数组的乘积
 * @author hly
 * @Description:
 * @create 2021-04-20 19:31
 */
public class lc238 {
    public int[] productExceptSelf(int[] nums) {
        int length = nums.length;
        //记录i位置前缀后缀数组的乘积
        int[] l = new int[length];
        int[] r = new int[length];
        int[] res = new int[length];
        //0元素的l为1，因为前缀没有数字
        l[0] = 1;
        for (int i = 1; i < length; i++) {
            l[i] = nums[i-1] * l[i-1];
        }
        //最后一位元素的r为1，因为后缀没有数字
        r[length-1] = 1;
        for (int i = length-2; i>=0 ; i--) {
            r[i] = nums[i+1] * r[i+1];
        }
        for (int i = 0; i < length; i++) {
            res[i] = l[i] * r[i];
        }
        return res;
    }
}
