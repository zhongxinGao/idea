package com.day2;

public class new4 {
    public static void main(String[] args) {
        int[] a = {1, 3, 2, 9, 8, 6, 7};
        int max = a[0];
        for (int i = 1; i < a.length; i++) {

            if (max < a[i]) {
                max = a[i];
            }
        }
        System.out.println(max);
    }
}
