package com.mayikt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * ​
 *
 * @author grow
 * ​
 * @version v1.0
 * ​
 * @description ​
 * @date 2019-10-17 13:03
 * ​
 **/
@SpringBootApplication//扫包范围是同级包
@EnableScheduling//开启任务调度
public class AppSpringBoot {
    public static void main(String[] args) {
        SpringApplication.run(AppSpringBoot.class, args);
    }
}
