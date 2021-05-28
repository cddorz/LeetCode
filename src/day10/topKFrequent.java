package src.day10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * 给定一个非空的整数数组，返回其中出现频率前 k 高的元素。
 * @author han long yi
 * @create 2021-04-12 20:16
 */
public class topKFrequent {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            if(!map.containsKey(num)){
                map.put(num, 1);
            }else {
                map.put(num,map.get(num)+1);
            }
        }
        List<Integer> res = new ArrayList<>();

        //桶排序：将频率作为数组下标，对于出现频率不同的组合，存入对应数组下标
        List<Integer>[] list = new List[nums.length+1];
        for(int key : map.keySet()){
            //获取出现的次数作为下标
            int i = map.get(key);
            if(list[i]==null){
                //数组列表，防止出现不同数字相同频率
                list[i] = new ArrayList<>();
            }
            list[i].add(key);
        }

        //倒序遍历数组获取出现顺序从大到小排序
        for(int i = list.length - 1;i > 0 && res.size() < k;i--){
            if(list[i] == null) {
                continue;
            }
            res.addAll(list[i]);
        }
        int[] res1 = new int[res.size()];
        for(int i = 0; i < res.size();i++){
            res1[i] = res.get(i);
        }
        return res1;
    }
}
