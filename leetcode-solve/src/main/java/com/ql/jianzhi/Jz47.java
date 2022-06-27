package com.ql.jianzhi;

/**
 * @author wanqiuli
 * @date 2022/4/7 12:36 下午
 */
public class Jz47 {

    /**
     * function is maxValue
     * todo 还存在最优解
     *
     * @param grid the grid
     * @return the {@link int} data
     */
    public int maxValue(int[][] grid) {
        int[][] dp = new int[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                int max = grid[i][j];
                if (i - 1 >= 0) {
                    max = Math.max(dp[i - 1][j] + grid[i][j], max);
                }
                if (j - 1 >= 0) {
                    max = Math.max(dp[i][j - 1] + grid[i][j], max);
                }
                dp[i][j] = max;
            }
        }
        int max = Integer.MIN_VALUE;
        for (int[] ints : dp) {
            for (int anInt : ints) {
                max = Math.max(max, anInt);
            }
        }
        return max;
    }
}
