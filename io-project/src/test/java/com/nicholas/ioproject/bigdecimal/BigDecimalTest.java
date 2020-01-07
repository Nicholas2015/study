package com.nicholas.ioproject.bigdecimal;

import com.alibaba.fastjson.JSON;

import java.math.BigDecimal;

public class BigDecimalTest {

    public static void main(String[] args) {
        BigDecimal decimal1 = new BigDecimal("10.00");
        BigDecimal decimal2 = new BigDecimal("10.25");

        System.out.println(decimal1.toString());
        System.out.println(decimal2.toString());
        System.out.println(decimal1);
        System.out.println(decimal2);
        System.out.println(JSON.toJSONString(decimal1));
    }
}
