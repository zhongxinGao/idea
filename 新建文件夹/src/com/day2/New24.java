package com.day2;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class New24 {
    public static void main(String[] args) {
        try {
            //服务端打开端口8888
            ServerSocket s = new ServerSocket(6665);
            Socket ss = s.accept();
            InputStream i = ss.getInputStream();
            DataInputStream d = new DataInputStream(i);
            String str = d.readUTF();
            System.out.println(str);
            d.close();
            ss.close();
            s.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
