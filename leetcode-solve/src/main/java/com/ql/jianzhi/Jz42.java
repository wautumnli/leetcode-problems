package com.ql.jianzhi;

/**
 * @author wanqiuli
 * @date 2022/4/7 12:27 下午
 */
public class Jz42 {
    /**
     * function is maxSubArray
     * todo 存在最优解
     *
     * @param nums the nums
     * @return the {@link int} data
     */
    public int maxSubArray(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (dp[i - 1] > 0) {
                dp[i] = dp[i - 1] + nums[i];
            } else {
                dp[i] = nums[i];
            }
        }
        int max = Integer.MIN_VALUE;
        for (int j : dp) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }
}
