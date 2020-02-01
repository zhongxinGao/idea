package com.day1.www;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class New44 {
    public static void main(String[] args)throws IOException {

        File f = new File("f:/b.txt");
        FileReader f1 = new FileReader(f);
        int a ;
        while ((a = f1.read()) != -1){
            System.out.print((char)a);
        }
        f1.close();
    }
}
