package com.day2;

public class New25 {
    public static void main(String[] args) {
        System.out.println("******点外卖******");
        Me m = new Me();
        Thread t1 = new Thread(m);
        t1.start();


    }
}

class Me implements Runnable{
    @Override
    public void run(){
        System.out.println("肚子饿了想吃饭");
        System.out.println("打开微信，点外卖");
        Waimai w = new  Waimai();
        Thread t = new Thread(w);
        t.start();
        try {
            t.join();
            System.out.println("开门收外卖");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
class Waimai implements Runnable{
    @Override
    public void run(){
        System.out.println("收到外卖，准备配送");
        System.out.println("十字路口等红灯十秒");
        for (int i = 0; i<10 ; i++){
            System.out.println(i+"秒过去了");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("继续配送");
        System.out.println("提着买卖进小区");
    }
}
