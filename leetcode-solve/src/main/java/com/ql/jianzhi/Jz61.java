package com.ql.jianzhi;

import java.util.HashSet;
import java.util.Set;

/**
 * @author wanqiuli
 * @date 2022/4/15 12:30
 */
public class Jz61 {

    Set<Integer> repeat = new HashSet<>();

    public boolean isStraight(int[] nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num == 0) {
                continue;
            }
            max = Math.max(max, num);
            min = Math.min(min, num);
            if (repeat.contains(num)) {
                return false;
            }
            repeat.add(num);
        }
        return max - min < 5;
    }
}
