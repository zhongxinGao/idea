package com.day1.www;

public class New12 {
    public static void main(String[] args) {
        for (int i = 0; i<= 9; i++){
            for (int j = 0; j<= i; j++)
                System.out.print(j+"*"+i+"="+j*i+"\t");
            System.out.println();
        }
    }
}
