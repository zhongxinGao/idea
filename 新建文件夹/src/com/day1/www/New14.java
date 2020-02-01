package com.day1.www;

import java.util.Scanner;

public class New14 {
    public static void main(String[] args) {
        for (int j = 1; j <= 10; j++) {
        int i = 50;
        int x = 0;
            System.out.println("这是第："+j+"次");
        System.out.println("请输入一个数字");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();

            if (a == 50) {
                System.out.println("猜对了");
                break;
            } else {
                if (a < 50) {
                    System.out.println("猜小了");
                } else {
                    System.out.println("猜大了");
                }
            }
            System.out.println();
            continue;

        }

    }
}
