package com.mayikt.controoller;

import org.springframework.beans.factory.annotation.Value;
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
 * @date 2019-10-21 15:55
 * ​
 **/
@RestController
public class NewController {
    @Value("${gao.url}")
    private String url;
    @Value("gao.userName")
    private String userName;
    @RequestMapping("/getUrl")
    public String getUrl(){
        return "url";
    }
    @RequestMapping("/getUserName")
    public String getUserName(){
        return "username";
    }
}
