package com.zhang.www;



public class Test1 {
    public static void main(String[] args) {
    Thread1 t = new Thread1();
    Thread t1 = new Thread(t, "窗口一");
    Thread t2 = new Thread(t, "窗口二");
    Thread t3 = new Thread(t, "窗口三");

            t1.start();
            t2.start();
            t3.start();
    }
}
    class Thread1 implements Runnable{
    private int a = 50;
    public void run(){

        while(a>0){
            try {
                Thread.sleep(666);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(a-- +"这里是："+Thread.currentThread().getName());
        }
    }
    }


