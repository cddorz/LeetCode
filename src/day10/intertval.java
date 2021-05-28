package src.day10;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 621.任务调度器（贪心算法）
 * 此题建议多看leetcode
 * @author han long yi
 * @create 2021-04-14 23:15
 */
public class intertval {
    public int leastInterval(char[] tasks, int n) {
        Map<Character, Integer> map = new HashMap<>();
        //最多可执行次数
        int maxExec = 0;
        for(char ch : tasks){
            int exec = map.getOrDefault(ch, 0 + 1);
            map.put(ch,exec);
            maxExec = Math.max(maxExec,exec);
        }

        //具有最多可执行次数的任务数量
        int maxCount = 0;
        Set<Map.Entry<Character, Integer>> entrySet = map.entrySet();
        for(Map.Entry<Character,Integer> entry : entrySet){
            int value = entry.getValue();
            if(value == maxExec){
                ++maxCount;
            }
        }
        //若没有用到待命状态，则最短时间即为数组长度
        return Math.max((maxExec-1)*(n+1)+maxCount,tasks.length);
    }
}
