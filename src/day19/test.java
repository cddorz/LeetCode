package src.day19;


/**
 * @author hly
 * @Description: TODO
 * @create 2021-07-22 12:22
 */
public class test {
    public static void main(String[] args) {
        LRUCache obj = new LRUCache(2);
        obj.put(1,1);
        obj.put(2,2);
        obj.get(1);
        obj.put(3,3);
        int i = obj.get(2);
        System.out.println(i);
        obj.put(4,4);
        int i1 = obj.get(1);
        System.out.println(i1);
    }
}
