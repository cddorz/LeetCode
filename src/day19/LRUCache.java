package src.day19;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author hly
 * @Description: TODO
 * @create 2021-07-22 11:29
 */
public class LRUCache {

    private static PriorityQueue<Integer> minUsed;

    /**
     * 时间戳 timestamp
     */
    private static int timestamp = 0;

    private static int getkey = 0;

    /**
     * 维护一个 key 和 timestamp 的对应关系
     */
    private Map<Integer, Integer> map = new HashMap<>();

    private Map<Integer, Integer> cache;

    private final int capacity;

    public LRUCache(int capacity) {
        cache = new HashMap<>(capacity);
        this.capacity = capacity;
        minUsed = new PriorityQueue<>();
    }

    public int get(int key) {
        timestamp++;
        if(cache.containsKey(key)){
            map.put(key,timestamp);
            minUsed.offer(timestamp);
            return cache.get(key);
        }
        return -1;
    }

    public void put(int key, int value) {
        timestamp++;
        if(cache.size() >= capacity){
            Integer min = minUsed.remove();
            int min_pre = min.intValue();
            for(int getKey : map.keySet()){
                if(map.get(getKey).equals(min_pre)){
                    getkey = getKey;
                    break;
                }
           }
           cache.remove(getkey);
        }
        cache.put(key,value);
        minUsed.offer(timestamp);
        map.put(key,timestamp);
    }
}
