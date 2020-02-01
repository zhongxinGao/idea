package com.se;

import java.util.Scanner;

/**
 * ​
 *
 * @author grow
 * ​
 * @version v1.0
 * ​
 * @description ​
 * @date 2019-10-29 13:30
 * ​
 **/
public class New4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的分数");
        int a = scanner.nextInt();
        String b = a>=60 ? "及格" : "不及格";
        System.out.println(b);
    }
}
