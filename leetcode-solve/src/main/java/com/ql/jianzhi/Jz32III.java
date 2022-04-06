package com.ql.jianzhi;

import com.ql.pojo.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author wanqiuli
 * @date 2022/4/6 8:40 下午
 */
public class Jz32III {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean reverse = false;
        while (!queue.isEmpty()) {
            List<Integer> level = new ArrayList<>();
            List<Integer> current = new ArrayList<>();
            List<TreeNode> temp = new ArrayList<>();
            while (!queue.isEmpty()) {
                TreeNode poll = queue.poll();
                level.add(poll.val);
                if (poll.left != null) {
                    temp.add(poll.left);
                }
                if (poll.right != null) {
                    temp.add(poll.right);
                }
            }
            if (!level.isEmpty()) {
                if (reverse) {
                    for (int i = level.size() - 1; i >= 0; i--) {
                        current.add(level.get(i));
                    }
                    result.add(current);
                } else {
                    result.add(level);
                }
                reverse = !reverse;
            }
            queue.addAll(temp);
        }
        return result;
    }
}
