package com.mayikt;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * ​
 *
 * @author grow
 * ​
 * @version v1.0
 * ​
 * @description ​
 * @date 2019-10-18 13:47
 * ​
 **/
@SpringBootApplication
@MapperScan("com.mayikt.mapper")
public class SpringMybatis {
    public static void main(String[] args) {
        SpringApplication.run(SpringMybatis.class, args);
    }
}
