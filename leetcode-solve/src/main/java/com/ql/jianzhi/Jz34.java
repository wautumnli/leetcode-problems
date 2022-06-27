package com.ql.jianzhi;

import com.ql.pojo.TreeNode;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @author wanqiuli
 * @date 2022/4/11 22:00
 */
public class Jz34 {

    List<List<Integer>> res = new LinkedList<>();
    Deque<Integer> deque = new LinkedList<>();

    public List<List<Integer>> pathSum(TreeNode root, int target) {
        dfs(root, target);
        return res;
    }

    public void dfs(TreeNode node, int target) {
        if (node == null) {
            return;
        }
        target -= node.val;
        deque.offerLast(node.val);
        // 到叶子节点,且满足条件的情况
        if (node.left == null && node.right == null && target == 0) {
            res.add(new LinkedList<>(deque));
        }
        dfs(node.left, target);
        dfs(node.right, target);
        // 弹出最后一个节点
        deque.pollLast();
    }
}
