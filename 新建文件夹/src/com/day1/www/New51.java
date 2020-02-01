package com.day1.www;

public class New51 {
    public static void main(String[] args) {
        Solve s = new Solve();
        s.person.start();
    }
}
    class Solve implements Runnable{
    Thread person;
    Thread joinPerson;
    public Solve(){
        person = new Thread(this);
        joinPerson = new Thread(this);
        person.setName("排队");
        joinPerson.setName("插队");
    }
    public void run(){
        if(Thread.currentThread() == person){
            System.out.println(person.getName()+"想买票");
            joinPerson.start();
            try {
                joinPerson.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(person.getName()+"开始买票");
        }else if(Thread.currentThread() == joinPerson){
            System.out.println(joinPerson.getName()+"我急我先买");
            System.out.println(joinPerson.getName()+"买票中");
            try {
                Thread.sleep(666);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("买票完毕");
        }
    }
    }
