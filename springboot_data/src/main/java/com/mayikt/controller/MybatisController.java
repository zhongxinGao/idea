package com.mayikt.controller;

import com.mayikt.member.MemberMapper;
import com.mayikt.order.OrderMapper;
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
 * @date 2019-10-18 15:39
 * ​
 **/
@RestController
public class MybatisController {
    @Autowired
    private OrderMapper orderMapper;
    @Autowired

    private MemberMapper memberMapper;

    //调用会员数据库
    @RequestMapping("/addUser")
    public String addUser(String name, Integer age){
        return memberMapper.addUser(name, age) > 0 ? "success":"fail";
    }

    //调用订单数据库
    @RequestMapping("/")
    public String inserOrder(String number){
       return orderMapper.inserOrder(number)> 0 ? "success":"fail";
    }
}
