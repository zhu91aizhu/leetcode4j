package com.lmfamily.leetcode.p0100.problem011;

import org.assertj.core.api.Assertions;

public class Main {
    public static void main(String[] args) {
        var solution = new Solution2();
        Assertions.assertThat(solution.maxArea(new int[]{1,8,6,2,5,4,8,3,7}))
                .isEqualTo(49);
        Assertions.assertThat(solution.maxArea(new int[]{1,1}))
                .isEqualTo(1);

    }

}
