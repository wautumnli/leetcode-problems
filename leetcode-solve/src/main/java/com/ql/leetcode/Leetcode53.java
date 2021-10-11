package com.ql.leetcode;

public class Leetcode53 {

    public static void main(String[] args) {
        int[] nums = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(new Solution().maxSubArray(nums));
    }

    static class Solution {
        public int maxSubArray(int[] nums) {
            int number = 0;
            int max = Integer.MIN_VALUE;
            for (int i = nums.length - 1; i >= 0; i--) {
                if (number < 0) {
                    number = nums[i];
                } else {
                    number = number + nums[i];
                }
                max = Math.max(max, number);
            }
            return max;
        }
    }
}
