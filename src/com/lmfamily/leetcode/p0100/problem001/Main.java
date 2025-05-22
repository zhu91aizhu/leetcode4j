package com.lmfamily.leetcode.p0100.problem001;

import org.assertj.core.api.Assertions;

public class Main {
    public static void main(String[] args) {
        var solution = new Solution1();
        Assertions.assertThat(solution.twoSum(new int[]{2,7,11,15}, 9))
                .isEqualTo(new int[]{0, 1});
        Assertions.assertThat(solution.twoSum(new int[]{3, 2, 4}, 6))
                .isEqualTo(new int[]{1, 2});
        Assertions.assertThat(solution.twoSum(new int[]{3, 3}, 6))
                .isEqualTo(new int[]{0, 1});

    }

}
