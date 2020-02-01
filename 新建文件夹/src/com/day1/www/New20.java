package com.day1.www;

public class New20 {
    public static void main(String[] args) {
    Run r = new Run();
    r.student();

    Run r1 = new Run();
    r1.name = "gao";
    r1.age = 21;
    r1.student();

    }
}
 class Run{
    String name = "zhang";
        int age = 18;
    public void student(){
        System.out.println("我叫"+name+"今年"+age+"岁");
    }
 }
