package src.day20;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author hly
 * @Description: 给定一个二叉树，找出其最小深度
 * @create 2021-07-24 21:45
 */
public class lc111 {
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
  public int minDepth(TreeNode root){
        if(root == null){
            return 0;
        }
        if(root.left == null && root.right == null){
            return 1;
        }
        int R = minDepth(root.right);
        int L = minDepth(root.left);
        if( root.right == null || root.left == null){
            return R + L + 1;
        }
        return Math.min(L,R) + 1;
  }
}
