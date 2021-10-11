package com.ql.leetcode;

public class Leetcode27 {
    public static void main(String[] args) {
        int[] nums = new int[]{3,2,2,3};
        int val = 1;
        System.out.println(new Solution().removeElement(nums, val));
    }

    static class Solution {
        public int removeElement(int[] nums, int val) {
            int j = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != val && j == i) {
                    j++;
                    continue;
                }
                if (nums[i] != val && j != i ) {
                    nums[j++] = nums[i];
                }
            }
            return j;
        }
    }
}
