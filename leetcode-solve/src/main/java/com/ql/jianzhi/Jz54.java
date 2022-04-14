package com.ql.jianzhi;

import com.ql.pojo.TreeNode;

/**
 * @author wanqiuli
 * @date 2022/4/14 12:59
 */
public class Jz54 {

    int res = 0;
    int index = 0;

    public int kthLargest(TreeNode root, int k) {
        this.index = k;
        dfs(root);
        return res;
    }

    public void dfs(TreeNode cur) {
        if (cur == null) {
            return;
        }
        dfs(cur.right);
        if (index == 0) {
            return;
        }
        index--;
        if (index == 0) {
            res = cur.val;
            return;
        }
        dfs(cur.left);
    }
}
