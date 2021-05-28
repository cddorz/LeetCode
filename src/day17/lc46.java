package src.day17;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * 46. 全排列
 * @author hly
 * @Description: 给定一个 没有重复 数字的序列，返回其所有可能的全排列。
 * @create 2021-04-21 9:28
 */
public class lc46 {
        public List<List<Integer>> permute(int[] nums) {
            int len = nums.length;
            // 使用一个动态数组保存所有可能的全排列
            List<List<Integer>> res = new ArrayList<>();
            if (len == 0) {
                return res;
            }
            //记录用过的位置，防止重复
            boolean[] used = new boolean[len];
            Deque<Integer> path = new ArrayDeque<>(len);

            dfs(nums, len, 0, path, used, res);
            return res;
        }

        private void dfs(int[] nums, int len, int depth, Deque<Integer> path, boolean[] used, List<List<Integer>> res) {
            if (depth == len) {
                res.add(new ArrayList<>(path));
                return;
            }

            for (int i = 0; i < len; i++) {
                if (!used[i]) {
                    path.addLast(nums[i]);
                    used[i] = true;
                    System.out.println("  递归之前 => " + path);
                    dfs(nums, len, depth + 1, path, used, res);

                    used[i] = false;
                    path.removeLast();
                    System.out.println("递归之后 => " + path);
                }
            }
        }
}

