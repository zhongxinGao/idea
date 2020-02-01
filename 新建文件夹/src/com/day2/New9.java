package com.day2;

public class New9 {
    public static void main(String[] args) {
        int a = 5;
        //基本数据类型转化为包装类
        Integer i = new Integer(a);
        //包装类转基本数据类型
        int b = i.intValue();

        int c = 6;
        //自动装箱
        Integer e = c;
        //自动拆箱
        int f = e;
    }
}
