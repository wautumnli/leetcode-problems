package com.ql.leetcode;

import com.ql.pojo.TreeNode;

/**
 * @author wanqiuli
 */
public class Leetcode111 {
    public int minDepth(TreeNode root) {
        return deep(root) + 1;
    }

    private int deep(TreeNode node) {
        if (node == null) {
            return -1;
        }
        if (node.left == null && node.right != null) {
            return deep(node.right) + 1;
        }
        if (node.right == null && node.left != null) {
            return deep(node.left) + 1;
        }
        return Math.min(deep(node.left), deep(node.right)) + 1;
    }
}
