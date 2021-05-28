package src.day13;

import java.util.ArrayList;
import java.util.List;

/**
 * 给你一个整数数组 nums ，数组中的元素 互不相同 。返回该数组所有可能的子集（幂集）。
 * @author han long yi
 * @create 2021-04-17 14:52
 */
public class subsets {
    public static List<List<Integer>> enumerate(int[] nums){
        //结果集
        List<List<Integer>> res = new ArrayList<>();
        //初始空集
        res.add(new ArrayList<Integer>());
        for(Integer num : nums){
            int size = res.size();
            //循环新增幂集
            for(int i = 0; i < size;i++){
                List<Integer> list = new ArrayList<>(res.get(i));
                list.add(num);
                res.add(list);
            }
        }
        return res;

    }
}
