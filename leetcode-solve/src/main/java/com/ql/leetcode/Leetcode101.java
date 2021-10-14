package com.ql.leetcode;

import java.util.*;

/**
 * @author wanqiuli
 */
public class Leetcode101 {
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
        TreeNode t2 = new TreeNode(4, null, null);
        TreeNode t3 = new TreeNode(4, null, null);
        TreeNode t4 = new TreeNode(3, null, null);
        TreeNode t5 = new TreeNode(2, t1, t2);
        TreeNode t6 = new TreeNode(2, t3, t4);
        TreeNode t7 = new TreeNode(1, t5, t6);
        boolean symmetric = new Leetcode101().isSymmetric(t7);
        System.out.println(symmetric);
    }

    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root.left);
        queue.offer(root.right);
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<TreeNode> list = new ArrayList<>();
            while (size != 0) {
                TreeNode cur = queue.poll();
                list.add(cur);
                if (cur != null) {
                    queue.offer(cur.left);
                    queue.offer(cur.right);
                }
                size--;
            }
            int last = list.size() / 2;
            for (int i = 0; i < last; i++) {
                TreeNode l = list.get(i);
                TreeNode r = list.get(list.size() - 1 - i);
                if (l == null && r == null) {
                    continue;
                } else if (l == null || r == null) {
                    return false;
                }
                if (l.val != r.val) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * 快速的方法
     *
     * @param root
     * @return
     */
    public boolean isSymmetric02(TreeNode root) {
        if (root == null) {
            return true;
        }
        return cmp(root.left, root.right);
    }

    private boolean cmp(TreeNode node1, TreeNode node2) {
        if (node1 == null && node2 == null) {
            return true;
        }
        if (node1 == null || node2 == null || node1.val != node2.val) {
            return false;
        }
        return cmp(node1.left, node2.right) && cmp(node1.right, node2.left);
    }
}
