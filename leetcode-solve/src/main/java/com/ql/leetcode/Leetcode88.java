package com.ql.leetcode;

import java.util.Arrays;

public class Leetcode88 {

    public static void main(String[] args) {
        int[] nums1 = new int[]{0};
        int[] nums2 = new int[]{1};
        new Leetcode88().merge(nums1, 0, nums2, 1);
        System.out.println(Arrays.toString(nums1));
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (nums2 == null) return;
        m = m - 1;
        n = n - 1;
        int last = m + n + 1;
        for (int i = m; i >= 0; i--) {
            int sum = 0;
            while (n >= 0 && nums1[i] <= nums2[n]) {
                sum++;
                n--;
            }
            while (sum > 0) {
                nums1[last--] = nums2[n + sum--];
            }
            if (n < 0) break;
            else {
                nums1[last--] = nums1[i];
                nums1[i] = 0;
            }
        }
        if (n >= 0) {
            for (int i = 0; i <= n; i++) {
                nums1[i] = nums2[i];
            }
        }
    }
}
