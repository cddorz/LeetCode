package src.二叉树.lc112;

/**
 * @author hly
 * @Description: 给你二叉树的根节点 root 和一个表示目标和的整数 targetSum ，
 * 判断该树中是否存在 根节点到叶子节点 的路径，这条路径上所有节点值相加等于目标和 targetSum 。
 * 叶子节点 是指没有子节点的节点。
 * @create 2021-10-31 15:28
 */
public class Solution {
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null){
            return false;
        }
        // 叶子节点
        if(root.left == null && root.right == null){
            return targetSum == root.val;
        }
        // 继续向下遍历，更新 sum 为 sum - root.val
        return hasPathSum(root.right,targetSum-root.val) || hasPathSum(root.left,targetSum-root.val);
    }
}
