package com.day1.www;

public class New30 {
    public static void main(String[] args) {
        int a = 999;
        System.out.println("二进制表示："+Integer.toBinaryString(a));
        System.out.println("八进制表示："+Integer.toOctalString(a));
        System.out.println("十进制表示："+a);
        System.out.println("十二进制表示："+Integer.toString(a, 12));
        System.out.println("十六进制表示："+Integer.toHexString(a));
    }
}
