package com.day2;

import java.io.File;
import java.io.FileInputStream;

public class New15 {
    public static void main(String[] args) throws Exception{
        File f = new File("f:/c.txt");

        FileInputStream f1 = new FileInputStream(f);
        byte[] b = new byte[(int)f.length()];
        f1.read(b);
        String s = new String(b,"utf8");
        System.out.println(s);
        f1.close();
    }
}
