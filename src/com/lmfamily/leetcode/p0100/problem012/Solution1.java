package com.lmfamily.leetcode.p0100.problem012;

import java.util.HashMap;
import java.util.Map;

public class Solution1 {

    static class Roman {
        public static Map<Integer, String> map = new HashMap<Integer, String>(){{
           put(1, "I");
           put(5, "V");
           put(10, "X");
           put(50, "L");
           put(100, "C");
           put(500, "D");
           put(1000, "M");
        }};

        public static int getBase(int num) {
            if (num > 1000) {
                return 1000;
            }

            if (num > 100) {
                return 100;
            }

            if (num > 10) {
                return 10;
            }

            return 1;
        }

        public static void get9Roman(StringBuilder sb, int base) {
            if (base == 100) {
                sb.append("CM");
            }
            else if (base == 10) {
                sb.append("XC");
            }
            else if (base == 1) {
                sb.append("IX");
            }
        }

        public static void get4Roman(StringBuilder sb, int base) {
            if (base == 100) {
                sb.append("CD");
            }
            else if (base == 10) {
                sb.append("XL");
            }
            else if (base == 1) {
                sb.append("IV");
            }
        }

        public static void getOtherRoman(StringBuilder sb, int f, int base) {
            if (f == 5) {
                sb.append(map.get(f * base));
                return;
            }

            if (f > 5) {
                sb.append(map.get(5 * base));
                for (int i = 1; i <= f-5; i++) {
                    sb.append(map.get(base));
                }
            }
            else {
                for (int i = 1; i <= f; i++) {
                    sb.append(map.get(base));
                }
            }
        }

        public static String get(int num) {
            StringBuilder roman = new StringBuilder();
            while (num > 0) {
                int base = getBase(num);
                int f = num / base;

                var number = map.get(num);
                if (number != null) {
                    roman.append(number);
                    num -= (f * base);
                    continue;
                }

                if (f == 9) {
                    get9Roman(roman, base);
                }
                else if (f == 4) {
                    get4Roman(roman, base);
                }
                else {
                    getOtherRoman(roman, f, base);
                }

                num -= (f * base);
            }

            return roman.toString();
        }
    }

    public String intToRoman(int num) {
        return Roman.get(num);
    }

}
