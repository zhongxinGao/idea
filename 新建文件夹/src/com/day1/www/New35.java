package com.day1.www;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class New35 {
    public static void main(String[] args) {
        Collection<String> a = new ArrayList<>();
            a.add("面对疾风吧");
            a.add("长路漫漫");
            a.add("唯剑作伴");
        System.out.println(a);
        System.out.println(a.contains("面对疾风吧"));
        System.out.println(a.size());
        System.out.println(a.isEmpty());
        System.out.println(a.remove("面对疾风吧"));
        System.out.println(a.toString());

        }
    }

