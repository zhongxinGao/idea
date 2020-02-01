package com.mayikt.controoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Map;

/**
 * ​
 *
 * @author grow
 * ​
 * @version v1.0
 * ​
 * @description ​
 * @date 2019-10-17 13:37
 * ​
 **/
@Controller
public class IndexController {
    @ResponseBody
    @RequestMapping("/index")
    public String index(){
        return "这是控制类";
    }
    @RequestMapping("/freemarkerIndex")
    public String freemarkerIndex(Map<Object, Object> resultMap){
        resultMap.put("name", "高中鑫");
        resultMap.put("sex", "1");
        ArrayList<Object> objects = new ArrayList<>();
        objects.add("mayiket");
        objects.add("meite");
        resultMap.put("objects", objects);
        return "freemarkerIndex";
    }
}
