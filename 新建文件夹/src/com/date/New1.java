package com.date;

import java.util.Scanner;

/**
 *哥德巴赫猜想
 */
public class New1 {
    public static void main(String[] args) {
    New1 n = new New1();
        Scanner s = new Scanner(System.in);
        System.out.println("请输入要验证的数字（n>6）");
        int i = s.nextInt();
        n.getGo(i);
    }
    //判断是不是素数
    public boolean isPrimeNum (int n){
        int i;
        for (i=2; i<n/2; i++){
            if (n%i == 0)
                break;
            }
            if (i >= n/2) return true;


        return false;
    }
    //验证哥德巴赫猜想
    public void getGo(int n){
        if (n<6 || n%2 == 1){
            System.out.println(n+"不满足哥德巴赫猜想");
            return;
        }
        for (int i = 2; i<= n-1; i++){
            if(this.isPrimeNum(i) && this.isPrimeNum(n-i)){
                System.out.println(n+"=" +i+"+"+(n-1));
                break;
            }
        }
    }
}
