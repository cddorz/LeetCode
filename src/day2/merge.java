package src.day2;

/**
 * 递归法合并二叉树
 * @author han long yi
 * @create 2021-04-02 15:17
 */
public class merge {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
    }
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1 == null || root2 == null) {
            return root1 == null ? root2 : root1;
        }
        return dfs(root1, root2);
    }
    public TreeNode dfs(TreeNode r1, TreeNode r2) {
        //终止条件
        if (r1 == null || r2 == null) {
            return r1 == null ? r2 : r1;
        }
        //树2合并到树1上
        //前序遍历二叉树
        r1.val += r2.val;
        r1.left = dfs(r1.left, r2.left);
        r1.right = dfs(r1.right, r2.right);
        return r1;
    }
}
