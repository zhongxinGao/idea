package com.day2;

public class New11 {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("abc");
        s.append("d");
        System.out.println(s);
        s.delete(0,1);
        System.out.println(s);
        s.insert(3,"sb");
        System.out.println(s);
        s.reverse();
        System.out.println(s);
        System.out.println(s.length());
        System.out.println(s.capacity());
    }
}
