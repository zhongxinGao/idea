package com.day1.www;

public class New21 {
    public static void main(String[] args) {
        Execution e = new Execution();
        e.run();
    }
}
    class Chain{
    public void run(){
        System.out.println("上班");
    }
    }
    class Execution extends Chain{
        @Override
        public void run() {
            super.run();
            System.out.println("睡觉");
        }
    }
