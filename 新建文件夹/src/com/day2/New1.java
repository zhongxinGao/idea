package com.day2;

import java.util.Arrays;

public class New1 {
    public static void main(String[] args) {
        int [] a = {1,2,3,6,7,9};
        System.out.println(a);
        System.out.println(Arrays.toString(a));
        for (int i = 0; i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        for (Object b:a){
            System.out.print(b+" ");
        }
    }
}
