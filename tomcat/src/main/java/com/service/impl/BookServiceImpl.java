package com.service.impl;

import java.util.List;
import java.util.Map;

import com.github.pagehelper.PageHelper;
import com.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ​
 *
 * @author grow
 * ​
 * @version v1.0
 * ​
 * @description ​
 * @date 2019-11-06 16:31
 * ​
 **/
@Service
public class BookServiceImpl implements com.service.BookService {
    @Autowired
    private BookMapper bookMapper;
    public List<Map<String, Object>> findBooks(Integer pageNnm, Integer pageSize){
        //分页
        PageHelper.startPage(pageNnm, pageSize);
        return bookMapper.selectBooks();
    }
}
