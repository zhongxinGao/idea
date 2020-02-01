package com.day1.www;

import java.util.Scanner;

public class New5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入你的年龄");
        int a = s.nextInt();
        if (a < 18) {
            System.out.println("未成年人禁止进入");
        } else if (a < 120) {
            System.out.println("欢迎光临");
        } else {
            System.out.println("请输入合法年龄");
        }
    }
}
