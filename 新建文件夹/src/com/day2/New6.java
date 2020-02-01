package com.day2;

import java.util.Arrays;

public class New6 {
    public static void main(String[] args) {
        int [] a  = {1, 3, -1, 99 ,11, 66};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.binarySearch(a, 99));
    }
}
