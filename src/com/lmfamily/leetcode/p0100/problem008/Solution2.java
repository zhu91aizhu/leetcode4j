package com.lmfamily.leetcode.p0100.problem008;

import java.util.HashMap;
import java.util.Map;

public class Solution2 {

    public int myAtoi(String s) {
        Automation automation = new Automation();
        for (char c : s.toCharArray()) {
            automation.get(c);
        }

        return (int) (automation.sign * automation.ans);
    }

}

class Automation {

    /**
     * 符号
     */
    public int sign = 1;

    /**
     * 计算结果
     */
    public long ans;

    private String state = "start";

    private Map<String, String[]> table = new HashMap<String, String[]>() {
        {
            put("start", new String[]{"start", "signed", "in_number", "end"});
            put("signed", new String[]{"end", "end", "in_number", "end"});
            put("in_number", new String[]{"end", "end", "in_number", "end"});
            put("end", new String[]{"end", "end", "end", "end"});
        }
    };

    private int get_col(char ch) {
        if (ch == ' ') {
            return 0;
        } else if (ch == '+' || ch == '-') {
            return 1;
        } else if (ch >= '0' && ch <= '9') {
            return 2;
        }

        return 3;
    }

    public void get(char ch) {
        state = table.get(this.state)[get_col(ch)];
        switch (state) {
            case "signed":
                sign = ch == '+' ? 1 : -1;
                break;
            case "in_number":
                this.ans = this.ans * 10 + (ch - '0');
                this.ans = this.sign == -1 ? Math.min(ans, -(long)Integer.MIN_VALUE) : Math.min(ans, Integer.MAX_VALUE);
        }
    }

}
