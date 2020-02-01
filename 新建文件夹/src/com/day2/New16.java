package com.day2;

import java.io.File;
import java.io.FileWriter;

public class New16 {
    public static void main(String[] args) throws Exception{
        File f = new File("f:/d.txt");
        f.createNewFile();

        FileWriter f1 = new FileWriter(f);

        String s = "常伴吾身";
        f1.write(s);
        f1.close();
        System.out.println("去F盘看看");
    }
}
