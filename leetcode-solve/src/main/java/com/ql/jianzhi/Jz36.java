package com.ql.jianzhi;


import com.ql.pojo.linked.Node;

/**
 * @author wanqiuli
 * @date 2022/4/14 12:25
 */
public class Jz36 {

    Node head, pre;

    /**
     * 中序遍历
     *
     * @param root the root
     * @return the {@link Node} data
     */
    public Node treeToDoublyList(Node root) {
        if (root == null) {
            return null;
        }
        dfs(root);
        head.left = pre;
        pre.right = head;
        return head;
    }

    public void dfs(Node node) {
        if (node == null) {
            return;
        }
        dfs(node.left);
        if (pre == null) {
            head = node;
        } else {
            pre.right = node;
        }
        node.left = pre;
        pre = node;
        dfs(node.right);
    }
}
