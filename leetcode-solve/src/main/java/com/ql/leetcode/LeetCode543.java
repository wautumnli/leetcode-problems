package com.ql.leetcode;

import com.ql.pojo.TreeNode;

/**
 * @author: wautumnli
 * @date: 2021-01-07 10:48
 * 543. 二叉树的直径
 **/
public class LeetCode543 {

    int max = 1;

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        System.out.println(new LeetCode543().diameterOfBinaryTree(root));
    }

    public int diameterOfBinaryTree(TreeNode root) {
        maxTreeLength(root);
        return max - 1;
    }

    public int maxTreeLength(TreeNode treeNode) {
        if (treeNode == null) return 0;
        int left = maxTreeLength(treeNode.left);
        int right = maxTreeLength(treeNode.right);
        max = Math.max(max, left + right + 1);
        return Math.max(left, right) + 1;
    }
}
