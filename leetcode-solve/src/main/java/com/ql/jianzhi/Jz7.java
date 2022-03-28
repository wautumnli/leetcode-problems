package com.ql.jianzhi;


import com.ql.pojo.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wanqiuli
 * @date 2022/3/28 13:10
 */
public class Jz7 {

    private Map<Integer, Integer> inorderMap;

    // todo 待优化
    public TreeNode buildTree(int[] preorder, int[] inorder, int preLeft, int preRight, int inLeft, int inRight) {
        if (preLeft > preRight) {
            return null;
        }
        int root = preorder[preLeft];
        int inOrder = inorderMap.get(root);
        int limit = inOrder - inLeft;
        TreeNode treeNode = new TreeNode(root);
        treeNode.left = buildTree(preorder, inorder, preLeft + 1, preLeft + limit, inLeft, inOrder - 1);
        treeNode.right = buildTree(preorder, inorder, preLeft + limit + 1, preRight, inOrder + 1, inRight);
        return treeNode;
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int length = preorder.length;
        inorderMap = new HashMap<>(length);
        for (int i = 0; i < length; i++) {
            inorderMap.put(inorder[i], i);
        }
        return buildTree(preorder, inorder, 0, length - 1, 0, length - 1);
    }
}
