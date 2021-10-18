package com.ql.leetcode;

import com.ql.leetcode.pojo.TreeNode;

/**
 * @author wanqiuli
 */
public class Leetcode112 {

    public boolean hasPathSum(TreeNode root, int targetSum) {
        return deep(0, root, targetSum);
    }

    public boolean deep(int number, TreeNode node, int targetSum) {
        if (node == null) {
            return false;
        }
        if (node.left == null && node.right == null) {
            return number + node.val == targetSum;
        }

        return deep(number + node.val, node.left, targetSum)
                || deep(number + node.val, node.right, targetSum);
    }
}
