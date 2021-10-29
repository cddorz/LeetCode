package src.二叉树.lc106;

import java.util.HashMap;

/**
 * @author hly
 * @Description: TODO
 * @create 2021-10-29 9:16
 */
public class Solution {
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
    private int[] inorder;
    private int[] postorder;
    private int rootIndex;
    private HashMap<Integer,Integer> map = new HashMap<>();
    public TreeNode build (int left,int right){
        if(left > right){
            return null;
        }
        int rootVal = postorder[rootIndex];
        TreeNode node = new TreeNode(rootVal);
        // 定位根节点在中序遍历中的位置
        int index = map.get(rootVal);
        rootIndex--;
        // 递归右子树和左子树
        node.right = build(index+1,right);
        node.left = build(left,index-1);
        return node;
    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder == null){
            return null;
        }
        this.inorder = inorder;
        this.postorder = postorder;
        // 定位根节点
        rootIndex = postorder.length - 1;
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i],i);
        }
        return build(0,inorder.length-1);
    }
}
