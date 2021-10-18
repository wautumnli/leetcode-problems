package com.ql.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wanqiuli
 */
public class Leetcode118 {

    public static void main(String[] args) {
        System.out.println(new Leetcode118().generate(5));
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> subset = new ArrayList<>();
            if (i <= 1) {
                for (int j = 0; j <= i; j++) {
                    subset.add(1);
                }
            } else {
                List<Integer> upper = result.get(i - 1);
                for (int j = 0; j <= i; j++) {
                    if (j == 0 || j == i) {
                        subset.add(1);
                    } else {
                        subset.add(upper.get(j) + upper.get(j - 1));
                    }
                }
            }
            result.add(subset);
        }
        return result;
    }
}
