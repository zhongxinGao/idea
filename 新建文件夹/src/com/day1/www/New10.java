package com.day1.www;

import java.util.Scanner;

public class New10 {
    public static void main(String[] args) {
        //三元运算
        Scanner s = new Scanner(System.in);
        System.out.println("请输入你的成绩");
        int a = s.nextInt();
        String b = a<60?"不及格":"及格";
        System.out.println(b);

        System.out.println("***");
        int c = -10;
        System.out.println(c>0?1:(c == 0?0:-1));
    }
}
