package src.day21;

import java.util.HashMap;
import java.util.Map;

/**
 * @author hly
 * @Description: 填充每个节点的下一个右侧节点指针 II
 * @create 2021-07-29 15:59
 */
public class lc117 {
    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    };

    private Map<Integer,Node> nodeMap = new HashMap<Integer, src.day21.lc117.Node>();

    private int depth = 0;

    public Node connect(Node root) {
        return null;
    }
}
