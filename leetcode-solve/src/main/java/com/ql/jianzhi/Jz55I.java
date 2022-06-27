package com.ql.jianzhi;

import com.ql.pojo.TreeNode;

/**
 * @author wanqiuli
 * @date 2022/4/18 20:01
 */
public class Jz55I {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}
