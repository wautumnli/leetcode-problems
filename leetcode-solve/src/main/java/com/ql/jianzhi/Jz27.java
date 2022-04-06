package com.ql.jianzhi;

import com.ql.pojo.TreeNode;

/**
 * @author wanqiuli
 * @date 2022/4/6 9:02 下午
 */
public class Jz27 {
    public TreeNode mirrorTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode left = root.left;
        root.left = mirrorTree(root.right);
        root.right = mirrorTree(left);
        return root;
    }
}
