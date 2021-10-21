package com.ql.leetcode;

import com.ql.pojo.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author: wautumnli
 * @date: 2021-01-03 16:27
 * 199. 二叉树的右视图
 **/
public class LeetCode199 {
    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.right = new TreeNode(3);
        node.left.right = new TreeNode(5);
        node.right.right = new TreeNode(4);
        new LeetCode199().rightSideView(node).stream().forEach(System.out::println);
    }

    public List<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Queue<TreeNode> nodeQueue = new LinkedList<>();
        nodeQueue.offer(root);
        //层序遍历
        while (!nodeQueue.isEmpty()) {
            int size = nodeQueue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = nodeQueue.poll();
                if (node.left != null) {
                    nodeQueue.offer(node.left);
                }

                if (node.right != null) {
                    nodeQueue.offer(node.right);
                }
                //取每一层最后一个加入
                if (i == size - 1) {
                    result.add(node.val);
                }
            }
        }

        return result;
    }
}
