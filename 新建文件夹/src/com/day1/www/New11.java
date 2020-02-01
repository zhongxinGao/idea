package com.day1.www;

/**
 * 无限循环
 * while(true)
 * for(;;)
 */
public class New11 {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        while (a <= 100){
            b += a;
            a++;
        }
        System.out.println(b);
        System.out.println("*********");
        int j = 0;
        for (int i = 0; i<= 100; i++){
            j += i;
        }
        System.out.println(j);
    }
}
