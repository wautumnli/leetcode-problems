package com.ql.leetcode;

import com.ql.leetcode.pojo.TreeNode;

/**
 * @author wanqiuli
 */
public class Leetcode110 {

    private static class DeepTreeNode {
        private final boolean isBalance;
        private final int deep;

        DeepTreeNode(boolean isBalance, int deep) {
            this.deep = deep;
            this.isBalance = isBalance;
        }
    }

    public boolean isBalanced(TreeNode root) {
        return isBalance(root) != -1;
    }


    /**
     * 最优方法
     */
    private int isBalance(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int l = isBalance(node.left);
        int r = isBalance(node.right);
        if (l == -1 || r == -1 || Math.abs(l - r) > 1) {
            return -1;
        }
        return Math.max(l, r) + 1;
    }

    private DeepTreeNode treeIsBalance(TreeNode node) {
        if (node == null) {
            return new DeepTreeNode(true, 0);
        }
        DeepTreeNode l = treeIsBalance(node.left);
        DeepTreeNode r = treeIsBalance(node.right);
        if (!l.isBalance || !r.isBalance || Math.abs(l.deep - r.deep) > 1) {
            return new DeepTreeNode(false, 0);
        }
        return new DeepTreeNode(true, Math.max(l.deep, r.deep) + 1);
    }
}
