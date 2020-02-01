package com.day1.www;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class New42 {
    public static void main(String[] args)throws Exception {
        File f = new File("f:/a.txt");
        if (f.exists()){
            f.delete();
        }else {
            f.createNewFile();
        }
        FileOutputStream f1 = new FileOutputStream(f);
        String a = "我于杀戮之中绽放";
        byte [] b = a.getBytes();
        for (int i = 0; i<b.length; i++){
            f1.write(b[i]);
        }
        f1.close();
        System.out.println("去看F盘");
     }
}
