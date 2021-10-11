package com.ql.leetcode;

public class Leetcode26 {

    public static void main(String[] args) {
        int[] nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(new Solution().removeDuplicates(nums));
    }

    static class Solution {
        public int removeDuplicates(int[] nums) {
            if (nums.length <= 1) return nums.length;
            int diff = 0;
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] != nums[i - 1]) {
                    nums[++diff] = nums[i];
                }
            }
            return ++diff;
        }
    }
}
