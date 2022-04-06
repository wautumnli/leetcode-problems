package com.ql.jianzhi;

/**
 * @author wanqiuli
 * @date 2022/4/6 9:13 下午
 */
public class Jz63 {
    public int maxProfit(int[] prices) {
        int[] dp = new int[prices.length];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] - prices[i - 1] + dp[i - 1] > 0) {
                dp[i] = prices[i] - prices[i - 1] + dp[i - 1];
            }
        }
        int max = 0;
        for (int j : dp) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }
}
