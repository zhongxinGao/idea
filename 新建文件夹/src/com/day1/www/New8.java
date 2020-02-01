package com.day1.www;

import java.math.BigDecimal;

public class New8 {
    public static void main(String[] args) {
        //浮点数不精确，不能用于比较
        float a = 0.6f;
        double b = 6/10.0;
        System.out.println(a);
        System.out.println(b);
        System.out.println(a == b);

        //任意精度的浮点运算
        BigDecimal m = BigDecimal.valueOf(0.6);
        BigDecimal n = BigDecimal.valueOf(6/10.0);
        System.out.println(n.equals(m));
    }

}
