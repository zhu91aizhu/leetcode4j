package com.lmfamily.leetcode.p0100.problem008;

public class Solution1 {

    public int myAtoi(String s) {
        char[] chars = new char[s.length()];
        char fh = '+';

        boolean head = true;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (head && c == ' ') {
                continue;
            }

            if (head && (c == '-' || c == '+')) {
                fh = c;
                head = false;
                continue;
            }

            if (c < '0' || c > '9') {
                break;
            }

            chars[count++] = c;
            head = false;
        }

        if (count == 0) {
            return 0;
        }

        if (count == 1) {
            int number = Integer.parseInt(String.valueOf(chars, 0, count));
            return fh == '+' ? number : -number;
        }

        int offset = 0;
        for(int i=0; i<chars.length; i++) {
            if (chars[i] != '0') {
                offset = i;
                break;
            }
            else {
                count --;
            }
        }

        if (count > 10) {
            return fh == '+' ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }

        if (count == 0) {
            return 0;
        }

        String s1 = String.copyValueOf(chars, offset, count);
        long number = fh == '+' ? Long.parseLong(s1) : -Long.parseLong(s1);
        if (number < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }

        if (number > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }

        return (int) number;
    }



}
