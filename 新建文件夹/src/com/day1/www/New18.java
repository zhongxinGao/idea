package com.day1.www;

import java.util.Scanner;

public class New18 {
    public static void main(String[] args) {
        String [] p1 = {"衣服", "666", "蓝色"};
        String [] p2 = {"裤子", "555", "黑色"};
        String [] p3 = {"鞋子", "999", "白色"};
        String [][] p= new String[3][];
        p[0] = p1;
        p[1] = p2;
        p[2] = p3;

        System.out.println("请输入你要查询的商品名称");
        Scanner s = new Scanner(System.in);
        String a = s.next();
        s.close();

        for (int i = 0; i<p.length;i++){
            if (p[i][0].equals(a)){
                System.out.println(p[i][0]);
                System.out.println(p[i][1]);
                System.out.println(p[i][2]);
            }else {
                System.out.println("没有相关物品");
                break;
            }
        }

    }
}
