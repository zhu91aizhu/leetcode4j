package com.lmfamily.leetcode.p0100.problem006;

import org.assertj.core.api.Assertions;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        var solution = new Solution1();
//        Assertions.assertThat(solution.convert("PAYPALISHIRING", 3))
//                .isEqualTo("PAHNAPLSIIGYIR");
//        Assertions.assertThat(solution.convert("PAYPALISHIRING", 4))
//                .isEqualTo("PINALSIGYAHRPI");
//        Assertions.assertThat(solution.convert("A", 1))
//                .isEqualTo("A");
        Assertions.assertThat(solution.convert("ABC", 2))
                .isEqualTo("ACB");
    }

}
