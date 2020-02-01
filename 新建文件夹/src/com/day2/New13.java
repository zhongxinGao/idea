package com.day2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class New13 {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        String s = simpleDateFormat.format(d);
        System.out.println("当前时间："+s);
    }
}
