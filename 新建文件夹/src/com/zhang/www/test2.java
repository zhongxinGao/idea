package com.zhang.www;

import java.util.Arrays;

public class test2 {
    public static void main(String[] args) {
        int [] a = {2, 55, 11, 9, 7, 99, 6};
        for (int i = 0; i< a.length-1; i++){
            int min = i;
            for (int j = i+1; j <a.length; j++){
                if (a[j] < a[i]){
                    //保存最小元素下标
                    min = j;
                }
            }
            int tep = a[min];
            a[min] = a[i];
            a[i] = tep;
        }
        System.out.println(Arrays.toString(a));
    }
}
