package com.ql.jianzhi;

import com.ql.pojo.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author wanqiuli
 * @date 2022/4/6 8:31 下午
 */
public class Jz32II {

    /**
     * function is levelOrder
     * todo 存在优化空间
     *
     * @param root the root
     * @return the {@link List} data
     */
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            List<Integer> level = new ArrayList<>();
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
                result.add(level);
            }
            queue.addAll(temp);
        }
        return result;
    }
}
