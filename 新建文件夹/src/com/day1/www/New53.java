package com.day1.www;

import java.net.InetAddress;

public class New53 {
    public static void main(String[] args) throws Exception{
        InetAddress local = InetAddress.getLocalHost();
        System.out.println(local.toString());
        System.out.println(local.getHostAddress());
        System.out.println(local);
        System.out.println(local.getHostName());
        System.out.println(local.getCanonicalHostName());
    }
}

