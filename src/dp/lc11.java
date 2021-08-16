package src.dp;

/**
 * @author hly
 * @Description: 11. 盛最多水的容器
 * 给你 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点(i,ai) 。
 * 在坐标内画 n 条垂直线，垂直线 i的两个端点分别为(i,ai) 和 (i, 0) 。
 * 找出其中的两条线，使得它们与x轴共同构成的容器可以容纳最多的水。
 * 说明：你不能倾斜容器。
 * @create 2021-08-16 14:03
 */
public class lc11 {
    /**
     * 双指针一开始在数组两端
     * 缩小短板，面积有可能+也有可能-
     * 缩小长版，面积一定-
     * 所以利用动态规划，缩小短板，求出最大盛水面积
     * @param height
     * @return
     */
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int res = (j - i) * Math.min(height[i],height[j]);
        while (i < j){
            res = height[i] < height[j] ? Math.max(res,(j-i) * height[i++]) : Math.max(res,(j-i) * height[j++]);
        }
        return res;
    }
}
