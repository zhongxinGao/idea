package com.mapper;

import org.apache.ibatis.annotations.Select;

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
 * @date 2019-11-06 16:14
 * ​
 **/
public interface BookMapper {
    @Select("select * from user")
    List<Map<String, Object>> selectBooks();
}
