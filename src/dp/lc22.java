package src.dp;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hly
 * @Description: 括号生成
 * 数字 n 代表生成括号的对数，请你设计一个函数，用于能够生成所有可能的并且 有效的 括号组合。
 * 有效括号组合需满足：左括号必须以正确的顺序闭合。
 * @create 2021-09-13 10:53
 */
public class lc22 {
    /**
     * 隐式二叉树深度优先搜索遍历可能的结果
     * @param n
     * @return
     */
    public List<String> generateParenthesis(int n) {
            List<String> res = new ArrayList<>();
            if (n == 0) {
                return res;
            }

            // 执行深度优先遍历，搜索可能的结果
            dfs("", n, n, res);
            return res;
        }

        /**
         * @param curStr 当前递归得到的结果
         * @param left   左括号还有几个可以使用
         * @param right  右括号还有几个可以使用
         * @param res    结果集
         */
        private void dfs(String curStr, int left, int right, List<String> res) {
            // 在递归终止的时候，直接把它添加到结果集即可。
            if (left == 0 && right == 0) {
                res.add(curStr);
                return;
            }

            // 剪枝
            if (left > right) {
                return;
            }

            if (left > 0) {
                dfs(curStr + "(", left - 1, right, res);
            }

            if (right > 0) {
                dfs(curStr + ")", left, right - 1, res);
            }
        }
}
