package com.day1.www;
/**
 * 判断一个数是否为素数（只能被一和它本身整除）
 */

import java.util.Scanner;

public class New15 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int m = s.nextInt();
        for (int i = 2; i<=Math.sqrt(m); i++)
            if (m%i == 0)
                break;
    }
}
