package com.day1.www;

import java.util.Scanner;

public class New13 {
    public static void main(String[] args) {
        int n = 0;//猜的大小
        int m = 0;//猜的次数
        //随机产生0-99之间的一个整数
        int a = (int) (Math.random() * (100));
        //输入一个整数
        Scanner s = new Scanner(System.in);
        System.out.println("请猜一个0-99之间的数字");
        while (true){
            n = s.nextInt();
            if (n<a){
                System.out.println("猜小了");
            }else {
                System.out.println("猜大了");
            }

        }
    }


}