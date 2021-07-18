package src.day8;

import java.util.HashMap;
import java.util.List;

/** 动态规划算法，dp[i]表示s前i个字符能否拆分
 * 转移方程：dp[j] = dp[i] && check(s[i+1, j]);
 * check(s[i+1, j])就是判断i+1到j这一段字符是否能够拆分
 * 其实，调整遍历顺序，这等价于s[i+1, j]是否是wordDict中的元素
 * 这个举个例子就很容易理解。
 * 假如wordDict=["apple", "pen", "code"],s = "applepencode";
 * dp[8] = dp[5] + check("pen")
 * 翻译一下：前八位能否拆分取决于前五位能否拆分，加上五到八位是否属于字典
 * (注意：i的顺序是从j-1 -> 0哦~,因为substring（x，y）x-->0开始索引 y--->1开始索引)
 * @author han long yi
 * @create 2021-04-08 20:06
 */
public class chaifen {
    public HashMap<String,Boolean> map =  new HashMap<>();
    //检查s是否属于字典
    public boolean check(String s){
        return map.getOrDefault(s,false);
    }
    public boolean wordBreak(String s, List<String> wordDict) {
        for(String word : wordDict){
            map.put(word,true);
        }
        boolean[] dp = new boolean[s.length()+1];
        for(int j = 1;j < s.length();j++){
            for(int i = j-1; i >= 0; i--){
                // dp[8] = dp[5] + check("pen")
                dp[j] = dp[i] && check(s.substring(i,j));
                if(dp[j]){
                    break;
                }
            }
        }
        return dp[s.length()];
    }
}
