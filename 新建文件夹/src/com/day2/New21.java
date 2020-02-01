package com.day2;

public class New21 {
    public static void main(String[] args) {
        Shop p = new Shop();
        Thread t1 = new Thread(p, "窗口1");
        Thread t2 = new Thread(p, "窗口2");
        Thread t3 = new Thread(p, "窗口3");
        t1.start();
        t2.start();
        t3.start();
    }
}
class Shop implements Runnable{
    int a = 10;
    public void run(){
        while (a>0){

            System.out.println(Thread.currentThread().getName()+"余票"+--a);
            Thread.yield();
        }
    }
}
