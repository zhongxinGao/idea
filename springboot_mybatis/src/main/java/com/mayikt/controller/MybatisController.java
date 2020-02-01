package com.mayikt.controller;

import com.mayikt.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
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
 * @date 2019-10-18 13:54
 * ​
 **/
@RestController
public class MybatisController {
    @Autowired
    private UserMapper userMapper;
    @RequestMapping("/addUser")
    public String AddUser(String userName, Integer age){
        return userMapper.insert(userName, age)>0 ? "success" : "fail";
    }
}
