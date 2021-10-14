package com.ql.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Leetcode94 {
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

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(3, null, null);
        TreeNode t2 = new TreeNode(2, t1, null);
        TreeNode t3 = new TreeNode(1, null, t2);
        List<Integer> integers = new Leetcode94().inorderTraversal(t3);
        integers.forEach(System.out::println);
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;
        stack.push(root);
        while (!stack.empty()) {
            TreeNode cur = stack.peek();
            if (cur.left == null) {
                TreeNode pop = stack.pop();
                result.add(pop.val);
                if (pop.right != null) {
                    stack.push(pop.right);
                }
                continue;
            }
            stack.push(cur.left);
            cur.left = null;
        }
        return result;
    }
}
