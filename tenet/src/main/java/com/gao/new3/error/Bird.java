package com.gao.new3.error;

/**
 * ​
 *
 * @author grow
 * ​
 * @version v1.0
 * ​
 * @description ​
 * @date 2020-01-03 21:06
 * ​
 **/
public class Bird {
    public void mainMoveMode(String birdName){
        if("变色龙".equals(birdName)){
            System.out.println("变色龙有四只脚");
        }else {
            System.out.println(birdName+"会飞");
        }
    }
}
