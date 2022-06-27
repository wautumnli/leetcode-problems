package com.ql.leetcode;

/**
 * TODO 线段树
 *
 * @author wanqiuli
 * @date 2022/4/12 21:01
 */
public class Lc307_Binary_Indexed_Tree {

    int[] tree;
    int[] array;

    public Lc307_Binary_Indexed_Tree(int[] nums) {
        tree = new int[nums.length + 1];
        array = nums;
        System.arraycopy(nums, 0, tree, 1, nums.length);
        for (int i = 1; i < tree.length; i++) {
            int index = i + (i & -i);
            if (index < tree.length) {
                tree[index] += tree[i];
            }
        }
    }

    public void update(int index, int val) {
        int f = array[index];
        int diff = val - f;
        array[index] = val;
        index++;
        while (index < tree.length) {
            tree[index] += diff;
            index = index + (index & -index);
        }
    }

    public int sumRange(int left, int right) {
        return prefixSum(right) - prefixSum(left) + array[left];
    }

    private int prefixSum(int index) {
        index++;
        int sum = 0;
        while (index > 0) {
            sum += tree[index];
            index = index - (index & -index);
        }
        return sum;
    }

    public static void main(String[] args) {
        Lc307_Binary_Indexed_Tree lc307 = new Lc307_Binary_Indexed_Tree(new int[]{1, 3, 5});
        System.out.println(lc307.sumRange(0, 2));
        lc307.update(1, 2);
        System.out.println(lc307.sumRange(0, 2));
    }
}
