package com.lmfamily.leetcode.p0100.problem007;

public class Solution1 {

    public int reverse(int x) {
        int current = x;
        int ret = 0;
        while (current != 0) {
            int pop = current % 10;

            if ((x > 0 && ret > Integer.MAX_VALUE / 10) || (x > 0 && ret == Integer.MAX_VALUE / 10 && pop > 7)) {
                return 0;
            }

            if ((x < 0 && ret < Integer.MIN_VALUE / 10) || (x < 0 && ret == Integer.MIN_VALUE / 10 && pop < -8)) {
                return 0;
            }

            ret = ret * 10 + pop;
            current = current / 10;
        }

        return ret;
    }

    public static void main(String[] args) {
        Solution1 solution = new Solution1();
        System.out.println(solution.reverse(123));
        System.out.println(solution.reverse(-123));
        System.out.println(solution.reverse(120));
        System.out.println(solution.reverse(0));
        System.out.println(solution.reverse(1534236469));
//        System.out.println(Integer.MIN_VALUE);
//        System.out.println(Integer.MAX_VALUE);
    }

}
