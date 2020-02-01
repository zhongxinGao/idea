package com.mayikt.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ​
 *
 * @author grow
 * ​
 * @version v1.0
 * ​
 * @description ​
 * @date 2019-10-18 11:00
 * ​
 **/
@Controller
@SpringBootApplication
public class IndexController {
    @RequestMapping("/")
    public String index(){
        return "index";
    }

    public static void main(String[] args) {
        SpringApplication.run(IndexController.class, args);
    }
}
