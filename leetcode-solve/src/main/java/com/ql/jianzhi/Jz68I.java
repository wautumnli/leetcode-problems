package com.ql.jianzhi;

import com.ql.pojo.TreeNode;

/**
 * TODO 还存在最优
 *
 * @author wanqiuli
 * @date 2022/4/18 20:51
 */
public class Jz68I {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode result = root;
        while (true) {
            if (p.val < result.val && q.val < result.val) {
                result = result.left;
            } else if (p.val > result.val && q.val > result.val) {
                result = result.right;
            } else {
                break;
            }
        }
        return result;
    }
}
