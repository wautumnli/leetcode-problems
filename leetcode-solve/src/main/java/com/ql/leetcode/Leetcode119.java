package com.ql.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: wautumnli
 * @date: 2021-10-18 15:27
 **/
public class Leetcode119 {

    public List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i <= rowIndex; i++) {
            List<Integer> aux = new ArrayList<>();
            if (i <= 1) {
                for (int j = 0; j <= i; j++) {
                    aux.add(1);
                }
            } else {
                for (int j = 0; j <= i; j++) {
                    if (j == 0 || j == i) {
                        aux.add(1);
                    } else {
                        aux.add(result.get(j) + result.get(j - 1));
                    }
                }
            }
            result = aux;
        }
        return result;
    }
}
