package com.day1.www;

import java.util.Scanner;

public class New6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入季节");
        String a = s.next();

        switch (a) {
            case "春天":
                System.out.println("春有百花");
                break;
            case "夏天":
                System.out.println("夏有凉风");
                break;
            case "秋天":
                System.out.println("秋有月");
                break;
            case "冬天":
                System.out.println("冬有雪");
                    break;
                    default:
                        System.out.println("输入正确季节");
        }
    }
}