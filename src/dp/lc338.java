package src.dp;

import java.util.ArrayList;

/**
 * @author hly
 * @Description: 比特位计数
 * 给定一个非负整数 num。对于 0 ≤ i ≤ num 范围中的每个数字 i
 * 计算其二进制数中的 1 的数目并将它们作为数组返回。
 *
 * solution：奇数总比前一个偶数多一个
 * 偶数前一个偶数和它 / 2 的那个偶数的1个数相同
 * @create 2021-08-11  10:08
 */
public class lc338 {
    public int[] countBits(int n) {
        int[] res = new int[n+1];
        for (int i = 0; i < n; i++) {
            if(i % 2 == 1){
                res[i] = res[i-1] + 1;
            }else {
                res[i] = res[i / 2];
            }
        }
        return res;
    }
}
