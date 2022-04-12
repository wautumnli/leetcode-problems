package com.ql.leetcode;

/**
 * @author wanqiuli
 * @date 2022/4/12 12:31
 */
public class Lc307 {
    private int[] arrays;
    private int[] prefixSum;
    private int size;

    public Lc307(int[] nums) {
        arrays = nums;
        size = (int) Math.sqrt(nums.length);
        // 向上取整
        prefixSum = new int[(nums.length + size - 1) / size];
        for (int i = 0; i < nums.length; i++) {
            prefixSum[i / size] += arrays[i];
        }
    }

    public void update(int index, int val) {
        int f = arrays[index];
        prefixSum[index / size] += (val - f);
        arrays[index] = val;
    }

    public int sumRange(int left, int right) {
        int ls = left / size;
        int rs = right / size;
        int sum = 0;
        if (ls == rs) {
            for (int i = left; i <= right; i++) {
                sum += arrays[i];
            }
            return sum;
        }
        for (int i = left; i < (ls + 1) * size; i++) {
            sum += arrays[i];
        }
        for (int i = ls + 1; i <= rs - 1; i++) {
            sum += prefixSum[i];
        }
        for (int i = right; i >= rs * size; i--) {
            sum += arrays[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Lc307 lc307 = new Lc307(new int[]{1, 3, 5});
        System.out.println(lc307.sumRange(0, 2));
        lc307.update(1, 2);
        System.out.println(lc307.sumRange(0, 2));
    }
}
