package com.mayikt.member;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

/**
 * ​
 *
 * @author grow
 * ​
 * @version v1.0
 * ​
 * @description ​
 * @date 2019-10-18 15:28
 * ​
 **/
public interface MemberMapper {
    @Insert("insert into users values (#{name}, #{age})")
     public int addUser(@Param("name") String name, @Param("age") Integer age);
}
