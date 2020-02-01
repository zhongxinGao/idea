package com.day2;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Date;
import java.util.Scanner;

public class New23 {
    public static void main(String[] args) {
        //客户端
        try {
            Socket s = new Socket("localhost", 6665);
            OutputStream o = s.getOutputStream();
            DataOutputStream d = new DataOutputStream(o);
            System.out.println("请输入内容");
            Scanner sc = new Scanner(System.in);
            String str = sc.next();
            d.writeUTF(str);
            d.close();
            s.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
