package com.mayikt.mapper;

import com.mayikt.entity.UserEntity;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * ​
 *
 * @author grow
 * ​
 * @version v1.0
 * ​
 * @description ​
 * @date 2019-10-18 13:42
 * ​
 **/
public interface UserMapper {
    @Select("select * from gao where name = #{name}")
    UserEntity findByName(@Param("naem") String name);
    @Insert("insert into gao(name, age) values (#{name}, #{age})")
    int insert(@Param("name") String name, @Param("age") Integer age);
}
