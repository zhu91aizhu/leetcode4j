package com.lmfamily.leetcode.p0100.problem011;

public class Solution2 {

    public int maxArea(int[] height) {
        int max = 0;
        for (int i=0, j=height.length-1; i<=j;) {
            int area = Math.min(height[i], height[j]) * (j-i);
            if (area > max) {
                max = area;
            }

            if (height[i] <= height[j]) {
                i++;
            }
            else {
                j--;
            }
        }

        return max;
    }

}
