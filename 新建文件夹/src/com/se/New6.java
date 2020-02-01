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
 * @date 2019-10-29 13:43
 * ​
 **/
public class New6 {
    public static void main(String[] args)throws Exception {
        File f = new File("F:/新建文件夹/a.txt");
        if(f.exists()){
            f.delete();
        }else {
            f.createNewFile();
        }
        System.out.println(f.canRead());
        System.out.println(f.canWrite());
        System.out.println(f.exists());
        System.out.println(f.getPath());
        System.out.println(f.lastModified());
        System.out.println(f.length());
        System.out.println(f.getName());

    }
}
