package com.lmfamily.leetcode.p0100.problem008;

import org.assertj.core.api.Assertions;

public class Main {
    public static void main(String[] args) {
//        var solution = new Solution1();
        var solution = new Solution2();
        Assertions.assertThat(solution.myAtoi("42")).isEqualTo(42);
        Assertions.assertThat(solution.myAtoi("-42")).isEqualTo(-42);
        Assertions.assertThat(solution.myAtoi("   -042")).isEqualTo(-42);
        Assertions.assertThat(solution.myAtoi("1337c0d3")).isEqualTo(1337);
        Assertions.assertThat(solution.myAtoi("0-1")).isEqualTo(0);
        Assertions.assertThat(solution.myAtoi("00000-42a1234")).isEqualTo(0);
        Assertions.assertThat(solution.myAtoi("words and 987")).isEqualTo(0);
        Assertions.assertThat(solution.myAtoi("+-12")).isEqualTo(0);
        Assertions.assertThat(solution.myAtoi("20000000000000000000")).isEqualTo(2147483647);
        Assertions.assertThat(solution.myAtoi("  0000000000012345678")).isEqualTo(12345678);
        Assertions.assertThat(solution.myAtoi("-91283472332")).isEqualTo(-2147483648);
    }

}
