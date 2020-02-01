package com.day1.www;

public class New32 {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("hello");
        System.out.println(s.insert(1,"2"));
        System.out.println(s.toString());
        System.out.println(s.delete(0,2));
        System.out.println(s.deleteCharAt(3));
        System.out.println(s.replace(0, 1, "a"));
    }
}
