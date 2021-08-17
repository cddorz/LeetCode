package src.dp;

/**
 * @author hly
 * @Description: 接雨水
 * 给定 n 个非负整数表示每个宽度为 1 的柱子的高度图，计算按此排列的柱子，
 * 下雨之后能接多少雨水。
 * @create 2021-08-17 11:16
 */
public class lc42 {
    /**
     * 遍历每一列，每一列存储的雨水量取决于左右两边最高的列的高度
     * 即：存储量 = 左右两边最高列的短板 - 这一列高度
     * 如果这一列高度 >= 短板，那么不存储雨水
     * 动态规划用两个数组存储每一列左右两边最高列的高度
     * @param height
     * @return
     */
    public int trap(int[] height) {
        int n = height.length;
        int[] max_left = new int[n];
        int[] max_right = new int[n];
        int res = 0;
        for (int i = 1; i < n - 1; i++) {
            max_left[i] = Math.max(max_left[i-1],height[i-1]);
        }
        for (int i = n - 2; i >= 0; i--) {
            max_right[i] = Math.max(max_right[i+1],height[i+1]);
        }
        for (int i = 1; i < n - 1; i++) {
            int min = Math.min(max_left[i],max_right[i]);
            if(min > height[i]){
                res = res + min - height[i];
            }
        }
        return res;
    }
}
