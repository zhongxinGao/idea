package com.date;

/**
 * 递归
 */

public class New2 {
    public static void main(String[] args) {
       Integer a = New2.recursionSum(10);
        System.out.println(a);
    }
    public static Integer recursionSum(Integer n){
        if(n>0){
            return n+recursionSum(n-1);
        }else{
            return 0;
        }
    }
    int fun(int i)
    {
        if(10==i)
            return i;
        return i+fun(i+1);
    }
}
