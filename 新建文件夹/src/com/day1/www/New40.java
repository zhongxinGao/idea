package com.day1.www;

import java.io.File;
import java.io.IOException;

public class New40 {
    public static void main(String[] args)throws IOException {
        File f = new File("D:/idea.txt");
        if(f.exists()){
            f.delete();
        }else{
            f.createNewFile();
        }
        System.out.println("*************");
        System.out.println("文件绝对路径："+f.getAbsolutePath());
        System.out.println("文件是否可读："+f.canRead());
        System.out.println("文件是否可写："+f.canWrite());
        System.out.println(f.exists());
        System.out.println(f.getPath());
        System.out.println(f.isFile());
    }
}
