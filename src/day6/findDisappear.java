package src.day6;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个范围在  1 ≤ a[i] ≤ n ( n = 数组大小 ) 的 整型数组，数组中的元素一些出现了两次，另一些只出现一次。
 * 找到所有在 [1, n] 范围之间没有出现在数组中的数字。
 * 解法：遍历数组，遍历一次x就使nums[x-1] + n，这样如果数组中没有的数字，那么他们-1对应的下标的数应该<=n
 * 由此筛选出不是数组中的数字
 * @author han long yi
 * @create 2021-04-06 15:02
 */
public class findDisappear {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        for(int num : nums){
            //有可能这个x已经加过n了，除于还原原来的数字
            int x = (num - 1) % n;
            nums[x]+=n;
        }
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0;i < n;i++){
            if(nums[i] <= n){
                list.add(i+1);
            }
        }
        return list;
    }
}
