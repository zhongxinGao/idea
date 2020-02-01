package com.day1.www;

import java.util.Iterator;
import java.util.TreeSet;

public class New37 {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet();
        treeSet.add("tom");
        treeSet.add("eve");
        treeSet.add("lucy");
        treeSet.add("susan");
        treeSet.add("eve");
        Iterator iterator = treeSet.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
        System.out.println();
        System.out.println(treeSet.descendingSet());
    }
}

