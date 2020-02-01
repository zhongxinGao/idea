package com.day2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class New18 {
    public static void main(String[] args) {
        ArrayList <Integer>a = new ArrayList<>();
        a.add(1);
        a.add(3);
        a.add(5);
        a.add(7);
        for (Object b:a){
            System.out.print(b);
        }
        System.out.println();

        Iterator b = a.iterator();
        while (b.hasNext()){
            Object o = b.next();
            System.out.print(o);
        }
        System.out.println();

        for (int j = 0; j<a.size(); j++){
            Object e = a.get(j);
            System.out.print(e);
        }


        //集合转数组
        int size = a.size();
        Integer []  f =  new Integer[a.size()];
        f = (Integer[]) a.toArray(f);
        for (Object o:f){
            System.out.print(o);
        }

    }
}
