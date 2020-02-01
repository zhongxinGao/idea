package com.mayikt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

/**
 * ​
 *
 * @author grow
 * ​
 * @version v1.0
 * ​
 * @description ​
 * @date 2019-10-18 12:56
 * ​
 **/
@Service
public class UserService {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    public boolean addUser (String name, Integer age){
        int update = jdbcTemplate.update("insert into gao values(?, ?);", name, age);
        return update>0 ? true : false;
    }
}
