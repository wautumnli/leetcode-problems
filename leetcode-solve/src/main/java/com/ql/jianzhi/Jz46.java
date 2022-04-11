package com.ql.jianzhi;

/**
 * @author wanqiuli
 * @date 2022/4/11 20:05
 */
public class Jz46 {
    public int translateNum(int num) {
        char[] strArray = String.valueOf(num).toCharArray();
        int[] dp = new int[strArray.length + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= strArray.length; i++) {
            int val = (strArray[i - 2] - '0') * 10 + strArray[i - 1] - '0';
            if (val >= 10 && val <= 25) {
                dp[i] = dp[i - 1] + dp[i - 2];
            } else {
                dp[i] = dp[i - 1];
            }
        }
        return dp[strArray.length];
    }

    public static void main(String[] args) {
        System.out.println(new Jz46().translateNum(12258));
    }
}
