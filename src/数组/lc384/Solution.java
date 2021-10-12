package src.数组.lc384;

import java.util.Random;

/**
 * @author hly
 * @Description: 给你一个整数数组 nums ，设计算法来打乱一个没有重复元素的数组。
 * 实现 Solution class:
 * Solution(int[] nums) 使用整数数组 nums 初始化对象
 * int[] reset() 重设数组到它的初始状态并返回
 * int[] shuffle() 返回数组随机打乱后的结果
 * @create 2021-10-12 17:05
 */
public class Solution {

    private int[] original;

    private int[] array;

    Random rand = new Random();

    public Solution(int[] nums) {
        original = nums;
        array = nums.clone();
    }

    private int randRange(int left,int right){
        return rand.nextInt(right - left) + left;
    }

    private void swap(int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public int[] reset() {
        array = original;
        return array;
    }

    public int[] shuffle() {
        for (int i = 0; i < array.length; i++) {
            swap(i,randRange(i,array.length));
        }
        return array;
    }
}
