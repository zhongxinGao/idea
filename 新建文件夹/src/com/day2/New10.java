package com.day2;

public class New10 {
    public static void main(String[] args) {
    //数字转字符串
        int a = 6;
        //第一种方法
        String s = String.valueOf(a);
        //第二种方法
        Integer i = a;
        String b = i.toString();

        //字符串转数字
        String c = "66";
        int e = Integer.parseInt(c);
        System.out.println(e);
    }
}
