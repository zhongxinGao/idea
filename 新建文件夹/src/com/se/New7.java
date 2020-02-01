package com.se;

import java.io.File;

/**
 * ​
 *
 * @author grow
 * ​
 * @version v1.0
 * ​
 * @description ​
 * @date 2019-10-29 13:53
 * ​
 **/
public class New7 {
    public static void main(String[] args) {
        File file = new File("e:/");
        System.out.println("文件名称");
        System.out.println("--------");
        String [] fileList = file.list();
        for (int i = 0; i<fileList.length; i++ ){
            System.out.print(fileList[i]+"\t\t");
            System.out.print((new File("e:/", fileList[i])).isFile()?"文件"+"\t\t":"文件夹"+"\t\t");
            System.out.println((new File("c:/", fileList[i])).length()+"字节");
        }
    }
}
