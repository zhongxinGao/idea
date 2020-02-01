package com.service;

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
 * @date 2019-11-06 18:17
 * ​
 **/
public interface BookService {
    List<Map<String, Object>> findBooks(Integer pageNnm, Integer pageSize);
}
