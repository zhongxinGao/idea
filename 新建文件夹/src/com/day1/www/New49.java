package com.day1.www;

public class New49 {
    public static void main(String[] args) {
        Noob n = new Noob();
        n.staff.start();
        n.person.start();
    }
}
    class Noob implements Runnable{
    Thread staff;
    Thread person;
    public Noob(){
        staff = new Thread(this);
        person = new Thread(this);
        staff.setName("售票员");
        person.setName("乘客");
    }
    public void run(){
        if(Thread.currentThread() == staff){
            System.out.println(staff.getName()+"休息");
            try {
                Thread.sleep(666);
            } catch (InterruptedException e) {
                System.out.println(staff.getName()+"被叫醒了");

            }
            System.out.println(staff.getName()+"开始买票");
        } else if(Thread.currentThread() == person){
            System.out.println("乘客说买票");
            staff.interrupt();
        }
    }
    }
