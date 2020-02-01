package com.mayikt.exception;


import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

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
 * @date 2019-10-23 16:13
 * ​
 **/
@ControllerAdvice
public class GaoExceptionHandler {
    @ExceptionHandler(RuntimeException.class)
    @ResponseBody
    public Map<String, String> exceptionHandler(){
        HashMap<String, String> map = new HashMap<>();
        map.put("errorCode", "404");
        map.put("errorMsg", "找不到页面");
        return map;
    }
}
