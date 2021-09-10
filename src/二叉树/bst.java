package src.二叉树;


/**
 * 给定一个二叉树，判断其是否是一个有效的二叉搜索树。
 * pre用的很妙！
 * @author han long yi
 * @create 2021-04-09 15:42
 */
public class bst {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
    }
    long pre = Long.MIN_VALUE;
    public boolean isValidBST(TreeNode root) {
        if(root == null){
            return true;
        }
        //递归遍历左子树
        if(!isValidBST(root.left)){
            return false;
        }
        // 访问当前节点：如果当前节点小于等于中序遍历的前一个节点，说明不满足BST，返回 false；否则继续遍历。
        if(root.val <= pre){
            return false;
        }
        pre = root.val;
        //递归遍历右子树
        return isValidBST(root.right);
    }
}
