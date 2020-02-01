package com.day2;

import java.io.File;
import java.io.FileOutputStream;

public class New12 {
    public static void main(String[] args) throws Exception{
        //创建源
        File f = new File("f:/c.txt");
        f.createNewFile();
        //选择流
        FileOutputStream f1 = new FileOutputStream(f);
        //操作
        String s = "快乐如风";
        byte[] b = s.getBytes();
        //

            f1.write(b);

        System.out.println("去F盘看看");
        f1.close();
    }
}
