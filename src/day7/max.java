package src.day7;

/**
 * 股票问题（动态规划）比较简单
 * @author han long yi
 * @create 2021-04-07 20:10
 */
public class max {
    public int maxProfit(int[] prices) {
        int min=prices[0];
        int res=0;
        for(int i : prices){
            if(min>=i){
                min = i;
                continue;
            }
            res = Math.max(res,i-min);
        }
        return res;
    }
}
