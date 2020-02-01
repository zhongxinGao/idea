package com.gao.controller;

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
 * @date 2019-11-07 13:15
 * ​
 **/
@Controller
public class ForwardController {
    @RequestMapping("/forwardhtml")
    public String forwardHtml(){
        return "html";
    }

    @RequestMapping("/html")
    public String html(){
        return "redirect: static/html/html.html";
    }
}
