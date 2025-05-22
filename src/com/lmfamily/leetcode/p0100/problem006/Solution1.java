package com.lmfamily.leetcode.p0100.problem006;

public class Solution1 {

    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }

        int[] nums = new int[numRows];
        char[][] chars = new char[numRows][s.length()];
        int currentCol = 0;
        int currentRow = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (currentCol % (numRows-1) == 0) {
                chars[currentRow][currentCol] = c;
                nums[currentRow]++;
                if (currentRow == numRows - 1) {
                    currentCol ++;
                    if (numRows == 2) {
                        currentRow = 0;
                    }
                }
                else {
                    currentRow++;
                }
            }
            else {
                chars[--currentRow][currentCol++] = c;
                nums[currentRow]++;
                if (currentCol % (numRows-1) == 0) {
                    currentRow = 0;
                }
            }
        }

        char[] newChars = new char[s.length()];
        int pos = 0;
        for (int i = 0; i < chars.length; i++) {
            int count = 0;
            for (int j = 0; j <chars[i].length; j++) {
                if (chars[i][j] != 0) {
                    count++;
                    newChars[pos++] = chars[i][j];
                }

                if (count == nums[i]) {
                    break;
                }
            }
        }
        return new String(newChars);
    }

}
