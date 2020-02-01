package com.day2;

public class New22 {
    public static void main(String[] args) {
        Bolb b = new Bolb();
        Bold d = new Bold();
        Thread t1 = new Thread(b, "一号");
        Thread t2 = new Thread(d, "二号");
        Thread t3 = new Thread(d, "三号");

        t2.start();
        t1.start();
        t3.start();
    }
}
    class Bold implements Runnable{
    int a = 10;
    public void run(){
        while (a>0){

            System.out.println(Thread.currentThread().getName()+"余票"+a--);
            Thread.yield();
        }
    }
    }
    class Bolb implements Runnable{
    int a = 10;
    public void run(){
        while (a>0){

            System.out.println(Thread.currentThread().getName()+"余票"+a--);
        }
    }
}
