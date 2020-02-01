package com.day1.www;

public class New46 {
    public static void main(String[] args) {
        Thread2 t = new Thread2();
        Thread2 h = new Thread2();
        Thread t1 = new Thread(t);
        Thread t2 = new Thread(h);
        t1.start();
        t2.start();
    }
}
    class Thread2 implements Runnable{
    private int a = 10;
    public void run(){
        while (a>0){
            System.out.println(a--);
        }
    }
    }
