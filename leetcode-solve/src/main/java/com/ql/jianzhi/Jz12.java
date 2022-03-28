package com.ql.jianzhi;

/**
 * @author wanqiuli
 * @date 2022/3/28 9:52 下午
 */
public class Jz12 {
    public boolean exist(char[][] board, String word) {
        // DFS + 剪枝
        char[] array = word.toCharArray();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (dfs(board, array, i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean dfs(char[][] board, char[] array, int i, int j, int k) {
        if (i < 0 || j < 0 || i >= board.length || j >= board[i].length || board[i][j] != array[k]) {
            return false;
        }
        if (k == array.length - 1) {
            return true;
        }
        board[i][j] = '\0';
        // 上下左右四个方向
        boolean res = dfs(board, array, i + 1, j, k + 1) || dfs(board, array, i - 1, j, k + 1)
                || dfs(board, array, i, j + 1, k + 1) || dfs(board, array, i, j - 1, k + 1);
        board[i][j] = array[k];
        return res;
    }
}
