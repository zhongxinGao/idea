package com.day1.www;

public class New19 {
    public static void main(String[] args) {
    Teacher t = new Teacher();
    t.name = "吖";
    t.a();
    t.run();
    }
}
    class Person{
    String name;
    void run(){
        System.out.println("工作");
    }
    }
    class Teacher extends Person{
    void a(){
        System.out.println(name);
    }
    }
