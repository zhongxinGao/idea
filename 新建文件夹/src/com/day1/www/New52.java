package com.day1.www;

public class New52 {
    public static void main(String[] args) {
        Idea i = new Idea();
        Thread t1 = new Thread(i,"一号楼");
        Thread t2 = new Thread(i,"二号楼");
        Thread t3 = new Thread(i,"三号楼");
        t1.start();
        t2.start();
        t3.start();
    }
}
    class Idea implements Runnable {
        private int a = 10;

        public void run() {
            synchronized (this) {
                while (a > 0) {
                    try {
                        Thread.sleep(66);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + a--);
                }
            }
        }
    }
