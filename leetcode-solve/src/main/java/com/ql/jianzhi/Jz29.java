package com.ql.jianzhi;

/**
 * @author wanqiuli
 * @date 2022/4/7 12:47 下午
 */
public class Jz29 {
    public int[] spiralOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return new int[0];
        }
        int m = matrix.length;
        int n = matrix[0].length;
        int[] res = new int[m * n];
        int index = 0;
        int left = 0;
        int right = n - 1;
        int top = 0;
        int bottom = m - 1;
        while (left <= right && top <= bottom) {
            for (int i = left; i <= right; i++) {
                res[index++] = matrix[top][i];
            }
            for (int i = top + 1; i <= bottom; i++) {
                res[index++] = matrix[i][right];
            }
            if (left < right && top < bottom) {
                for (int i = right - 1; i > left; i--) {
                    res[index++] = matrix[bottom][i];
                }
                for (int i = bottom; i > top; i--) {
                    res[index++] = matrix[i][left];
                }
            }
            left++;
            right--;
            top++;
            bottom--;
        }
        return res;
    }
}
