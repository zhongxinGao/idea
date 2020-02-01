package com.day1.www;

public class New47 {
    public static void main(String[] args) {
        Thread3 t = new Thread3();
        Thread t1 = new Thread(t,"儿童");
        Thread t2 = new Thread(t,"成人");
        Thread t3 = new Thread(t,"爱心");
        t1.start();
        t2.start();
        t3.start();
    }
}
    class Thread3 implements Runnable{
    private int a =10;
    public void run(){

        while (a>0){
            System.out.println(Thread.currentThread().getName()+a--);
            Thread.yield();
        }
    }
    }
