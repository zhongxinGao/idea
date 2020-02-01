package com.day2;

import java.io.File;
import java.io.FileReader;

public class New17 {
    public static void main(String[] args) throws Exception{
        File f = new File("f:/d.txt");

        FileReader f1 = new FileReader(f);

        int a = 0;
        while (a != -1){
            a = f1.read();
            System.out.print((char)a);
        }
        f1.close();
    }
}
