package src.二叉树;

/**
 * @author hly
 * @Description: TODO
 * @create 2021-10-09 11:02
 */
public class lc100 {
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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        while(p != null && q != null){
            if(p.val != q.val){
                return false;
            }
            return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
        }
        if(p == null && q != null){
            return false;
        }
        if(p != null && q == null){
            return false;
        }
        return true;
    }
}
