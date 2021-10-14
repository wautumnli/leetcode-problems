package com.ql.leetcode;

import java.util.Stack;

/**
 * @author wanqiuli
 */
public class Leetcode100 {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        Stack<TreeNode> stackP = new Stack<>();
        Stack<TreeNode> stackQ = new Stack<>();
        stackP.push(p);
        stackQ.push(q);
        while (!stackP.empty() && !stackQ.empty()) {
            TreeNode curP = stackP.pop();
            TreeNode curQ = stackQ.pop();
            if (curP == null && curQ == null) {
                continue;
            } else if (curP == null || curQ == null) {
                return false;
            }
            if (curP.val != curQ.val) {
                return false;
            }
            stackP.push(curP.left);
            stackP.push(curP.right);
            stackQ.push(curQ.left);
            stackQ.push(curQ.right);
        }
        return stackP.empty() && stackQ.empty();
    }
}
