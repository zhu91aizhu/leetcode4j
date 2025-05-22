package com.lmfamily.leetcode.p0100.problem003;

import java.util.HashSet;

/**
 * time: 120 ms
 * memory: 44.7 MB
 */
public class Solution1 {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;

        for (int i=0; i<s.length(); i++) {
            HashSet<String> set = new HashSet<>();
            int currentMax = 0;
            for(int j=i; j<s.length(); j++) {
                String c = String.valueOf(s.charAt(j));
                if (!set.contains(c)) {
                    set.add(c);
                    currentMax++;
                } else {
                    break;
                }
            }

            if (currentMax > max) {
                max = currentMax;
            }

            if (max >= s.length() - i) {
                break;
            }
        }

        return max;
    }
}
