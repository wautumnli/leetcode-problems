package com.ql.leetcode;

/**
 * @author wanqiuli
 */
public class Leetcode260 {

    public static void main(String[] args) {
        int t = 110721554 ^ 640411520;
        int[] nums = new int[]{29328859, 1466838361, -66079248, 926571150, 1456000429, 926571150, 1536309894, -182157937, -391092726, 1518731260, -66079248, -1116874613, -1703212692, -1116874613, -1321264512, -816411092, -483719306, 110721554, 29328859, -357092863, -391092726, -357092863, 1466838361, -1703212692, -1321264512, 1518731260, 1536309894, 640411520, -182157937, -816411092, 1456000429, -483719306};
        int[] ints = new Leetcode260().singleNumber(nums);
        int i = 0;
    }

    public int[] singleNumber(int[] nums) {
        int xor = 0;
        for (int num : nums) {
            xor ^= num;
        }
        int a = xor;
        int bit = 1;
        while ((a & 1) == 0) {
            a = a >> 1;
            bit = bit << 1;
        }
        int b = 0;
        for (int num : nums) {
            if ((num & bit) != 0) {
                b = b ^ num;
            }
        }
        return new int[]{b, xor ^ b};
    }
}
