package com.nicholas.leetcode.easy;

import lombok.Getter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RomanNum {

    /**
     * 字符          数值
     * I             1
     * V             5
     * X             10
     * L             50
     * C             100
     * D             500
     * M             1000
     * IV            4
     * IX            9
     * XL            40
     * XC            90
     * CD            400
     * CM            900
     * I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。
     * X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。
     * C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900
     */
    enum Roman {
        I("I", 1),
        II("II", 2),
        III("III", 3),
        V("V", 5),
        IV("IV", 4),
        X("X", 10),
        IX("IX", 9),
        XL("XL", 40),
        L("L", 50),
        C("C", 100),
        XC("XC", 90),
        D("D", 500),
        CD("CD", 400),
        M("M", 1000),
        CM("CM", 900);

        @Getter
        private String roman;
        @Getter
        private int arabic;

        private static Map<String, Integer> romanValue = new HashMap<>();

        static {
            for (Roman value : values()) {
                romanValue.put(value.roman, value.arabic);
            }
        }

        Roman(String roman, int arabic) {
            this.roman = roman;
            this.arabic = arabic;
        }

        public static int parse(String roman) {
            Integer arabic = romanValue.get(roman);
            return arabic;
        }
    }

    public int romanToInt(String s) {
        int sum = 0;
        List<String> list = new ArrayList<>();
        int index = 0;
        Roman[] values = Roman.values();
        for (int i = values.length - 1; i >= 0; i--) {
            String roman = values[i].roman;
            if (s.contains(roman)) {
                list.add(roman);
                s = s.replaceAll(roman, "");
            }
        }

        for (String str : list) {
            sum += RomanNum.Roman.parse(str);
        }

        return sum;
    }
}
