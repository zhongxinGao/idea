package com.day1.www;

public class New50 {
    public static void main(String[] args) {
        Action a = new Action();
        Thread t1 = new Thread(a,"儿童");
        Thread t2 = new Thread(a,"成人");
        Thread t3 = new Thread(a,"爱心");
        t1.start();
        t2.start();
        t3.start();
    }
}
    class Action implements Runnable{
    private int a = 10;
    public void run(){
        while (a>0){
            try {
                Thread.sleep(666);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+ a--);
        }
    }
    }
