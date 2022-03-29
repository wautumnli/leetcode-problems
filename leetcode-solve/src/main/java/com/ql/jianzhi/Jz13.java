package com.ql.jianzhi;

/**
 * @author wanqiuli
 * @date 2022/3/29 9:28
 */
public class Jz13 {
    public int movingCount(int m, int n, int k) {
        // todo bfs方法
        boolean[][] array = new boolean[m][n];
        return dfs(array, 0, 0, 0, 0, k);
    }

    public int dfs(boolean[][] array, int i, int j, int si, int sj, int k) {
        if (i >= array.length || j >= array[i].length || array[i][j] || si + sj > k) {
            return 0;
        }
        array[i][j] = true;
        // 1 <= x <= 100时，如果(x+1)%10==0, x+1的位数之和等于x的位数之和-8否则就是+1
        // (19+1)%10 == 0,所以20的位数和2等于19的位数和10 - 8
        return 1 + dfs(array, i + 1, j, (i + 1) % 10 == 0 ? si - 8 : si + 1, sj, k)
                + dfs(array, i, j + 1, si, (j + 1) % 10 == 0 ? sj - 8 : sj + 1, k);
    }

    public static void main(String[] args) {
        System.out.println(new Jz13().movingCount(3, 2, 1));
    }
}
