package com.controller.admin;

import com.github.pagehelper.PageInfo;
import com.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * ​
 *
 * @author grow
 * ​
 * @version v1.0
 * ​
 * @description ​
 * @date 2019-11-06 15:37
 * ​
 **/
@Controller
public class AdminController {
    @Autowired
    private BookService bookService;
    @RequestMapping("/admin/rest")
    public @ResponseBody String test(){

        return "hello ssm";
    }
    @RequestMapping("/admin/getBooks")
   public @ResponseBody List<Map<String, Object>> getBooks(Integer pageNnm, Integer pageSize){
      List<Map<String, Object>> bookList = bookService.findBooks(pageNnm, pageSize);
        PageInfo<Map<String, Object>> pageInfo = new PageInfo<Map<String, Object>>(bookList);
        return pageInfo.getList();
   }
}
