package com.lmfamily.leetcode.p0100.problem011;

public class Solution1 {

    public int maxArea(int[] height) {
        int max = 0;
        for (int i = 0; i < height.length - 1; i++) {
            for (int j = i + 1; j < height.length; j++) {
                int h = Math.min(height[i], height[j]);
                max = Math.max(max, (j - i) * h);
            }
        }

        return max;
    }

}
