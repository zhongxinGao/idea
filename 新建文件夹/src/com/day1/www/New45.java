package com.day1.www;

public class New45 {
    public static void main(String[] args) {
    Thread1 t = new Thread1();
    Thread1 t2 = new Thread1();
    Thread1 t3 = new Thread1();
    Thread h = new Thread(t3);
    t2.start();
    t.start();
    h.start();
    }
}
    class Thread1 extends Thread{
    private int a =10;
    public void run(){
        while (a>0){
            System.out.println(a--);
        }
    }
    }
