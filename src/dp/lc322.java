package src.dp;

import java.util.Arrays;

/**
 * @author hly
 * @Description: 给你一个整数数组 coins ，表示不同面额的硬币；以及一个整数 amount ，表示总金额。
 * 计算并返回可以凑成总金额所需的 最少的硬币个数 。如果没有任何一种硬币组合能组成总金额，返回-1
 * @create 2021-09-22 21:46
 */
public class lc322 {
    public int coinChange(int[] coins, int amount) {
        // 用于判断是否能组成 amount
        int max = amount + 1;
        int[] dp = new int[amount + 1];
        Arrays.fill(dp,max);
        dp[0] = 0;
        //以 coins[1,2,5], amount = 11 为例
        // 回归方程 dp[11] = min(dp[11-1],dp[11-2],dp[11-5]) + 1
        // 并且 dp[0] = 0, 若 coins[j] > i 则忽略
        for (int i = 1; i <= amount ; i++) {
            for (int j = 0; j < coins.length; j++) {
                if(coins[j] <= i){
                    dp[i] = Math.min(dp[i],dp[i-coins[j]]+1);
                }
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];
    }
}
