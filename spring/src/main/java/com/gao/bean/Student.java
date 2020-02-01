package com.gao.bean;

import org.springframework.stereotype.Component;

/**
 * ​
 *
 * @author grow
 * ​
 * @version v1.0
 * ​
 * @description ​
 * @date 2019-11-07 19:52
 * ​注解注入
 **/
@Component("student")
public class Student {
    private String name ="高中鑫";
    private int age = 22;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void gao(){
        System.out.println(getName()+"今年"+getAge()+"了");
    }
}
