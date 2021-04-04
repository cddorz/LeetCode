package src.day4;

/**
 * 给定一个二叉树，找出其最大深度。
 * @author han long yi
 * @create 2021-04-04 21:32
 */
public class maxDepth {
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        //递归
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return Math.max(left,right) + 1;
    }

    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
    }
}
