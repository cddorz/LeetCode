package src.day19;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hly
 * @Description: 二叉树的右视图
 * 给定一个二叉树的 根节点 root，想象自己站在它的右侧
 * 按照从顶部到底部的顺序，返回从右侧所能看到的节点值。
 *
 * * @create 2021-07-23 11:06
 */
public class lc199 {

    List<Integer> res = new ArrayList<>();

    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
    public List<Integer> rightSideView(TreeNode root) {
        if (root == null) {
            return null;
        }
        dfs(root, 0);

        return res;
    }
    public void dfs(TreeNode root,int depth){
        // 如果 depth == res 的大小，则表明这个层数还没遍历过
        if(res.size() == depth){
            res.add(root.val);
        }
        // 保证先遍历右节点
        dfs(root.right,depth+1);
        dfs(root.left,depth+1);
    }
}
