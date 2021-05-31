package src.day3;

import java.util.HashMap;
import java.util.Map;

/**
 * 一个数组中只出现过一次的数据
 * @author han long yi
 * @create 2021-04-03 16:51
 */
public class single {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(Integer i : nums){
            Integer count = map.get(i);
            count = count == null ? 1 : ++count;
            // 会覆盖旧值
            map.put(i,count);
        }
        for(Integer i : map.keySet()){
            Integer res = map.get(i);
            if(res == 1){
                return i;
            }
        }
        return -1;
    }
}
