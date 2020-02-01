package com.day1.www;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class New39 {
    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        Collections.addAll(a, "A", "B", "E", "W", "Z", "G");
        System.out.println("反转前");
        System.out.println(a);
        Collections.reverse(a);
        System.out.println("反转后"+a);
        Collections.sort(a);
        System.out.println("排序后"+a);

        System.out.println(a);
    }
}
