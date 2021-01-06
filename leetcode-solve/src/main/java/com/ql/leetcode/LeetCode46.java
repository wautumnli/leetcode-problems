package com.ql.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author: wautumnli
 * @date: 2021-01-06 09:33
 * 46. 全排列
 **/
public class LeetCode46 {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        new LeetCode46().permute(nums).forEach(x -> {
            x.forEach(System.out::print);
            System.out.println();
        });
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> out = new ArrayList<>();
        for (int num : nums) {
            out.add(num);
        }

        int n = nums.length;
        backtrack(n, out, res, 0);
        return res;
    }

    public void backtrack(int n, List<Integer> out, List<List<Integer>> res, int first) {
        if (first == n) {
            res.add(new ArrayList<>(out));
        }

        for (int i = first; i < n; i++) {
            Collections.swap(out, first, i);
            backtrack(n, out, res, first + 1);
            Collections.swap(out, first, i);
        }
    }
}
