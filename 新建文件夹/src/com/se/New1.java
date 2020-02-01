package com.se;

import java.util.*;

/**
 * ​
 *
 * @author grow
 * ​
 * @version v1.0
 * ​
 * @description ​
 * @date 2019-10-29 13:12
 * ​
 **/
public class New1 {
    public static void main(String[] args)throws Exception {
        Scanner scanner  = new Scanner(System.in);
        System.out.println("请输入一个季节");
        String s = scanner.next();
        switch (s){
            case "春天" :
                System.out.println("阳光明媚");
                break;
            default:
            System.out.println("四季如春");
        }
    }
}
