package com.ql.leetcode;

import com.ql.pojo.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wanqiuli
 */
public class Leetcode145 {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        deep(result, root);
        return result;
    }

    public void deep(List<Integer> result, TreeNode node) {
        if (node == null) {
            return;
        }
        deep(result, node.left);
        deep(result, node.right);
        result.add(node.val);
    }
}
