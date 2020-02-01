package com.day2;

import java.util.Arrays;

public class New5 {
    public static void main(String[] args) {
        int [] a = {1, 3, 5, 7, 9};
        int [] b = new int[5];
        //数组的拷贝第一种方式for循环
        for (int i = 0; i<a.length; i++){
            b[i] = a[i];

        }
        System.out.println(Arrays.toString(b));
        //数组拷贝第二种方式
        int [] d = Arrays.copyOf(a, 5);
        System.out.println(Arrays.toString(d));

        //数组拷贝第三种方式
        int[] c =Arrays.copyOfRange( a, 0, 5);
        System.out.println(Arrays.toString(c));
    }
}
