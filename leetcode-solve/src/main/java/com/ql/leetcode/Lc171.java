package com.ql.leetcode;

/**
 * @author wanqiuli
 * @date 2022/3/24 13:30
 */
public class Lc171 {

    public int titleToNumber(String columnTitle) {
        int number = 0;
        int multiple = 1;
        for (int i = columnTitle.length() - 1; i >= 0; i--) {
            int k = columnTitle.charAt(i) - 'A' + 1;
            number += k * multiple;
            multiple *= 26;
        }
        return number;
    }
}
