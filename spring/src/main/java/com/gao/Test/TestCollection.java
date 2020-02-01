package com.gao.Test;

import com.gao.bean.Collection;
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
 * @date 2019-11-08 10:04
 * ​
 **/
public class TestCollection {
    public static void main(String[] args) {


        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        Collection collection = (Collection) applicationContext.getBean("collection");
        System.out.println(collection.toString());
    }
}
