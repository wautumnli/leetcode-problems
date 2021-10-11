package com.ql.leetcode;

public class Leetcode35 {
    public static void main(String[] args) {
        int[] nums = new int[]{};
        int target = 0;
        System.out.println(new Solution().searchInsert(nums, target));
    }

    static class Solution {
        public int searchInsert(int[] nums, int target) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] >= target) return i;
            }
            return nums.length;
        }
    }
}
