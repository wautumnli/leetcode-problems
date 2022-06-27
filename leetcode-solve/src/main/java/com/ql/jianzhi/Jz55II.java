package com.ql.jianzhi;

import com.ql.pojo.TreeNode;

/**
 * TODO 还存在最优
 *
 * @author wanqiuli
 * @date 2022/4/18 20:04
 */
public class Jz55II {
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        return Math.abs(deep(root.left) - deep(root.right)) <= 1 && isBalanced(root.left) && isBalanced(root.right);
    }

    private int deep(TreeNode node) {
        if (node == null) {
            return 0;
        }
        return 1 + Math.max(deep(node.left), deep(node.right));
    }
}
