package com.mayikt.order;

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
 * @date 2019-10-18 15:36
 * ​
 **/
public interface OrderMapper {
    @Insert("insert into order_number values (#{number})")
     int inserOrder(@Param("number") String number);
}
