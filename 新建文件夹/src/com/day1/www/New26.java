package com.day1.www;

public class New26 {
    public static void main(String[] args) {
        Pole p = new Pole();
        p.run();
    }
}
    interface Translation {
    int id = 1;
    void run();
    }
    class Pole implements Translation{
        public void run(){
            System.out.println("面对疾风吧");
        }
    }
