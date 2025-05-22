package com.lmfamily.leetcode.p0100.problem009;

public class Solution1 {

    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        String number = String.valueOf(x);
        for (int i = 0; i < number.length() / 2; i++) {
            if (number.charAt(i) != number.charAt(number.length() - 1 - i)) {
                return false;
            }
        }

        return true;
    }

}
