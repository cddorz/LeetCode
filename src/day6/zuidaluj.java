package src.day6;

/**
 * 给定一棵二叉树，你需要计算它的直径长度。一棵二叉树的直径长度是任意两个结点路径长度中的最大值。这条路径可能穿过也可能不穿过根结点。
 * @author han long yi
 * @create 2021-04-06 23:40
 */
public class zuidaluj {
    int ans;
    public int diameterOfBinaryTree(TreeNode root) {
        ans = 1;
        if(root.left==null && root.right==null){
            return 0;
        }
        depth(root);
        return ans;
    }
    public int depth(TreeNode node) {
        if (node == null) {
            // 访问到空节点了，返回0
            return 0;
        }
        // 左儿子为根的子树的深度
        int L = depth(node.left);
        // 右儿子为根的子树的深度
        int R = depth(node.right);
        // 计算d_node即L+R+1 并更新ans
        ans = Math.max(ans, L+R);
        // 返回该节点为根的子树的深度
        return Math.max(L, R)+1;
    }
    public class TreeNode{
        int val;
        TreeNode right;
        TreeNode left;
    }
}
