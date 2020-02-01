package com.day2;

public class New7 {
    public static void main(String[] args) {
        String[] a = {"鞋子", "999"};
        String[] b = {"裤子", "666"};
        String[] c = {"袜子", "5"};
        String[][] d = new String[3][];

        d[0] = a;
        d[1] = b;
        d[2] = c;
        System.out.println("商品名称："+d[2][0]+"\n"+"商品价格："+d[2][1]);
    }
}
