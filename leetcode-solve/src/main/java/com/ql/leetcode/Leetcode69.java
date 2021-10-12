package com.ql.leetcode;

public class Leetcode69 {

    public static void main(String[] args) {
        System.out.println(new Leetcode69().mySqrt(8));
    }

    public int mySqrt(int x) {
        if (x <= 1) return x;
        int left = 0;
        int right = x;
        int mid = 0;
        while (right >= left) {
            mid = (left + right) >> 1;
            if (x / mid == mid) {
                return mid;
            }
            if (x / mid < mid) {
                right = mid - 1;
            } else {
                if (x / (mid + 1) < (mid + 1)) {
                    return mid;
                } else {
                    left = mid + 1;
                }
            }
        }
        return mid + 1;
    }
}
