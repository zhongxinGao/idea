package com.day1.www;

public class New24 {
    public static void main(String[] args) {
    Modest m = new Modest();
    m.assist();
    }
}
    class Cash{
    String name = "miss";
    public void run(){
        System.out.println("上班");
    }
    }
    class Modest extends Cash{
    String name = "zhang";
    public void assist(){
        System.out.println("名字"+super.name);
    }
    public void run(){
        super.run();
    }
    }
