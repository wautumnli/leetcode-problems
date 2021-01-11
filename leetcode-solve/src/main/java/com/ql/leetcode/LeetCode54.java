package com.ql.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: wautumnli
 * @date: 2021-01-11 09:22
 * 54. 螺旋矩阵
 **/
public class LeetCode54 {

    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> result = new ArrayList<>();
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return result;
        }

        int rows = matrix.length;
        int columns = matrix[0].length;
        int left = 0;
        int right = columns - 1;
        int top = 0;
        int bottom = rows - 1;
        while (left <= right && top <= bottom) {
            for (int i = left; i <= right; i++) {
                result.add(matrix[top][i]);
            }

            for (int i = top + 1; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }

            if (left < right && top < bottom) {
                for (int i = right - 1; i > left; i--) {
                    result.add(matrix[bottom][i]);
                }

                for (int i = bottom; i > top; i--) {
                    result.add(matrix[i][left]);
                }
            }
            left++;
            top++;
            right--;
            bottom--;
        }
        return result;
    }
}
