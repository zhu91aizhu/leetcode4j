package com.lmfamily.leetcode.p0100.problem003;

import java.util.HashMap;

/**
 * time: 95 ms
 * memory: 44.5 MB
 */
public class Solution2 {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;

        HashMap<String, Integer> map = new HashMap<>();
        for (int i=0; i<s.length(); i++) {
            int currentMax = 0;
            for(int j=i; j<s.length(); j++) {
                String c = String.valueOf(s.charAt(j));
                if (!map.containsKey(c)) {
                    map.put(c, j);
                    currentMax++;
                } else {
                    int pos = map.get(c);
                    i = pos + 1;
                    break;
                }
            }

            if (currentMax > max) {
                max = currentMax;
            }

            if (max >= s.length() - i) {
                break;
            }

            map.clear();
        }

        return max;
    }
}
