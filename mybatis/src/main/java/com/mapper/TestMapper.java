package com.mapper;

import com.bean.Ob;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * ​
 *
 * @author grow
 * ​
 * @version v1.0
 * ​
 * @description ​
 * @date 2019-11-04 17:04
 * ​注解增删查改
 **/
@Mapper
public interface TestMapper {
    @Insert("insert into ob value(#{id}, #{name}, #{age})")
    public void insert(Ob ob);
    @Delete("delete from ob where id = #{id}")
    public void delete(int id);
    @Select("select * from ob ")
    public List<Ob> list();
    @Update("update ob set id = #{id}, name = #{name}, age = #{age} where id = #{id}")
    public void update(Ob ob);
}
