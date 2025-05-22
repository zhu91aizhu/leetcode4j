package com.lmfamily.leetcode.p0100.problem010;

import org.assertj.core.api.Assertions;

public class Main {
    public static void main(String[] args) {
        var solution = new Solution1();
        Assertions.assertThat(solution.isPalindrome(121)).isEqualTo(true);
        Assertions.assertThat(solution.isPalindrome(-121)).isEqualTo(false);
        Assertions.assertThat(solution.isPalindrome(10)).isEqualTo(false);
    }

}
