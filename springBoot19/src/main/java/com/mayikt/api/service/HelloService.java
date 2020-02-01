package com.mayikt.api.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ​
 *
 * @author grow
 * ​
 * @version v1.0
 * ​
 * @description ​
 * @date 2019-10-17 12:39
 * ​
 **/
@RestController
//@EnableAutoConfiguration//启动springmvc,扫包范围为当前类
//@ComponentScan("com.mayikt.api.service")
public class HelloService {
    @RequestMapping("/springboot")
    public String hello(){
        return "hello springboot";
    }

    public static void main(String[] args) {
        SpringApplication.run(HelloService.class, args);
    }
}
