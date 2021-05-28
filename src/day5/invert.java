package src.day5;

/**
 * 翻转一棵二叉树。
 * 递归实现
 * @author han long yi
 * @create 2021-04-05 17:01
 */
public class invert {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
    }
    public TreeNode invertTree(TreeNode root) {
        if(root == null){
            return root;
        }
        TreeNode temp;
        temp = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(temp);
        return root;
    }
}
