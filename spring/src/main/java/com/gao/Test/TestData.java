package com.gao.Test;

import com.gao.bean.Data;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ​
 *
 * @author grow
 * ​
 * @version v1.0
 * ​
 * @description ​
 * @date 2019-11-07 21:01
 * ​
 **/
public class TestData {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        Data d = (Data)applicationContext.getBean("data");
        System.out.println(d.toString());
    }
}
