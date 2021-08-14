package src.位运算;

/**
 * @author hly
 * @Description: TODO
 * @create 2021-08-14 11:07
 */
public class lc231 {
    public static boolean isPowerOfTwo(int n) {
        /**
         * n-1 与 n
         * 16：10000， 15：01111
         * 8：1000， 7：0111
         */
        return n > 0 && (n & (n-1)) == 0;
    }
}
