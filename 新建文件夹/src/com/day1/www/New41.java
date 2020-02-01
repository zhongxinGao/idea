package com.day1.www;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;

public class New41 {
    public static void main(String[] args)throws IOException {
        File f = new File("f:/a.txt");
        FileInputStream f1 = new FileInputStream(f);
        System.out.println("默认编码："+ Charset.defaultCharset());
        int a = 0;
        while (a != -1){
            a = f1.read();

            System.out.println(a);
        }
    }
}
