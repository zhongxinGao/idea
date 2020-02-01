package com.day2;

public class New19 {
    public static void main(String[] args) {
        Student s = new Student();
        Teacher t = new Teacher();
        Thread t1 = new Thread(s);
        Thread t2 = new Thread(t);
        t1.start();
        t2.start();
    }
}
    class Student implements Runnable{
    int a = 5;
    public void run(){
        while (a>0){
            System.out.println(a--+"执行了一次");
        }
    }
    }
    class Teacher implements Runnable{
    int a = 5;
    public void run(){
        while (a>0){
            System.out.println(a--+"执行了一次");
        }
    }
    }

