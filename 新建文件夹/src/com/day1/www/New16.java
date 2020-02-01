package com.day1.www;

public class New16 {
    public static void main(String[] args) {
        int a = 0;
        for (int i = 100; i<=200; i++){
            if (i%3 == 0)
                continue;
                System.out.print(i + " ");
            if (++a%10 == 0){//输出十个换行
                System.out.println();
            }
        }
    }
}
