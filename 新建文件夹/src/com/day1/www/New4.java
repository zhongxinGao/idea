package com.day1.www;

public class New4 {
    public static void main(String[] args) {
        int a = 3456;
        String b = String.valueOf(a);

        System.out.println("个位："+b.charAt(3));
        System.out.println("十位："+b.charAt(2));
        System.out.println("百位："+b.charAt(1));
        System.out.println("千位："+b.charAt(0));
    }
}
