package com.mayikt.controller;

import com.mayikt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * ​
 *
 * @author grow
 * ​
 * @version v1.0
 * ​
 * @description ​
 * @date 2019-10-18 13:08
 * ​
 **/
@RestController
public class MyBatisController {
    @Autowired
    private UserService userService;
    @RequestMapping("/addUser")
    public String addUser(String userName, Integer age){
        return userService.addUser(userName, age)? "success":"fail";
    }
}
