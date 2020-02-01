package com.mayikt.api.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * ​
 *
 * @author grow
 * ​
 * @version v1.0
 * ​
 * @description ​
 * @date 2019-10-17 12:52
 * ​
 **/
@RestController
public class IndexService {
    @RequestMapping("/map")
    public Map<String, String> index(){
        Map<String, String> map = new HashMap<String, String>();
        map.put("respCode", "200");
        map.put("respMsg", "成功");
        return map;
    }
}
