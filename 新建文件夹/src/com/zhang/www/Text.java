package com.zhang.www;

public class Text {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static void main(String[] args) {
        Spen s = new Spen();
        s.run();
    }
}
 class Run{
    public void run (){
        System.out.println("我是父类");
    }
 }
 class Spen extends Run{
    public void run(){
        super.run();
        System.out.println("我是子类");
    }
 }
