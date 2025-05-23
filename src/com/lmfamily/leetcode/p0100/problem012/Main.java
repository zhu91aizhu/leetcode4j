package com.lmfamily.leetcode.p0100.problem012;

import org.assertj.core.api.Assertions;

public class Main {
    public static void main(String[] args) {
        var solution = new Solution1();
        Assertions.assertThat(solution.intToRoman(3749)).isEqualTo("MMMDCCXLIX");
        Assertions.assertThat(solution.intToRoman(58)).isEqualTo("LVIII");
        Assertions.assertThat(solution.intToRoman(1994)).isEqualTo("MCMXCIV");
        Assertions.assertThat(solution.intToRoman(20)).isEqualTo("XX");
        Assertions.assertThat(solution.intToRoman(110)).isEqualTo("CX");
    }

}
