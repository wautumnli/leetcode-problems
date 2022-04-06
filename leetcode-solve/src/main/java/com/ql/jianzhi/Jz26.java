package com.ql.jianzhi;

import com.ql.pojo.TreeNode;

/**
 * @author wanqiuli
 * @date 2022/4/6 8:45 下午
 */
public class Jz26 {

    /**
     * function is isSubStructure
     * todo 还需要理解
     *
     * @param A the A
     * @param B the B
     * @return the {@link boolean} data
     */
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        return (A != null && B != null) &&
                (recur(A, B) || isSubStructure(A.left, B) || isSubStructure(A.right, B));
    }

    boolean recur(TreeNode A, TreeNode B) {
        if (B == null) {
            return true;
        }
        if (A == null || A.val != B.val) {
            return false;
        }
        return recur(A.left, B.left) && recur(A.right, B.right);
    }
}
