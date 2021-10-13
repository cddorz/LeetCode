package src.二叉树;

/**
 * @author hly
 * @Description: 另一颗数的子树
 * @create 2021-07-28 22:23
 */
public class lc572 {
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

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        return dfs(root,subRoot);
    }

    public boolean dfs(TreeNode root,TreeNode subRoot){
        if(root == null){
            return false;
        }
        return dfs(root.left,subRoot) || dfs(root.right,subRoot) || check(root,subRoot);
    }

    public boolean check(TreeNode root, TreeNode subRoot){
        if(root == null && subRoot == null){
            return true;
        }
        if(root == null || subRoot == null || root.val != subRoot.val){
            return false;
        }
        return check(root.left,subRoot.left) && check(root.right,subRoot.right);
    }
}
