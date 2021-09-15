package src.二叉树;

/**
 * @author hly
 * @Description: 二叉树展开为链表
 * 给你二叉树的根结点 root ，请你将它展开为一个单链表：
 * 展开后的单链表应该同样使用 TreeNode ，其中 right 子指针指向链表中下一个结点，而左子指针始终为 null 。
 * 展开后的单链表应该与二叉树 先序遍历 顺序相同。
 * @create 2021-09-15 10:07
 */


public class lc114 {
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

    public void flatten(TreeNode root) {
        while (root != null){
            if (root.left != null) {
                // 找到左子树的最右边节点
                TreeNode pre = root.left;
                while (null != pre.right) {
                    pre = pre.right;
                }
                // 将右子树插入到左子树的最右边节点
                pre.right = root.right;
                root.right = root.left;
                // 清零左子树
                root.left = null;
            }
            // 寻找下一个节点
            root = root.right;
        }
    }

}
