package com.gao.proxy.CGlib.cglib1;

import org.springframework.cglib.proxy.Enhancer;

/**
 * ​
 *
 * @author grow
 * ​
 * @version v1.0
 * ​
 * @description ​
 * @date 2019-11-08 17:29
 * ​
 **/
public class Test {
    public static void main(String[] args) {
        //创建目标对象
        Sport sport = new Sport();
        Sport s =(Sport)Enhancer.create(sport.getClass(), new SportAdivce());
        s.sport();
    }
}
