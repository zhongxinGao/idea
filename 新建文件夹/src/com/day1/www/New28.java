package com.day1.www;

public class New28 {
    public static void main(String[] args) {
    Rank rank = new Former();
    rank.run();
    }
}
    class Rank{
        String name = "aa";
    public void run(){

        System.out.println("啧啧啧");
    }
    }
    class Former extends Rank{
        String name = "bb";
        public  void a(){

            System.out.println("名字"+super.name);
        }
        public void core(){
            super.run();
        }

    }
