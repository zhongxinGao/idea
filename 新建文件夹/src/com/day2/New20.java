package com.day2;

public class New20 {
    public static void main(String[] args) {
        Person p = new Person();
        Thread t1 = new Thread(p, "窗口1");
        Thread t2 = new Thread(p, "窗口2");
        Thread t3 = new Thread(p, "窗口3");
        t1.start();
        t2.start();
        t3.start();
    }
}
    class Person implements Runnable{
    int a = 10;
    public void run(){
        while (a>0){
            try {
                Thread.sleep(666);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(a--+Thread.currentThread().getName());
        }
    }
    }
