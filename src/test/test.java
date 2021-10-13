package src.test;

import src.堆.lc215;

/**
 * @author hly
 * @Description: TODO
 * @create 2021-10-09 19:20
 */
public class test {
    public static void main(String[] args) {
        lc215 obj = new lc215();
        int[] a = {5,6,1,3,4,2};
        int n = a.length;
        int largest = obj.findKthLargest(a, 2);
        System.out.println(largest);
    }

}
