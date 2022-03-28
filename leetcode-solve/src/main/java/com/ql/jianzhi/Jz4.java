package com.ql.jianzhi;

/**
 * @author wanqiuli
 * @date 2022/3/28 9:49
 */
public class Jz4 {

    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == target) {
                    return true;
                }
                if (matrix[i][j] < target && matrix[i][matrix[i].length - 1] >= target) {
                    continue;
                }
                if (matrix[i][j] < target && matrix[i][matrix[i].length - 1] < target) {
                    break;
                }
            }
        }
        return false;
    }
}
