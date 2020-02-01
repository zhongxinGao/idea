package com.day1.www;

import java.io.*;

public class New43 {
    public static void main(String[] args)throws IOException {
        File f = new File("f:/b.txt");
        f.createNewFile();
        FileWriter f1 = new FileWriter(f);
        String a = "亦如黎明中的花朵";
        f1.write(a);
        f1.close();
        System.out.println("去F盘看");
    }
}
