package com.Mybatis.api;

import com.bean.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

/**
 * ​
 *
 * @author grow
 * ​
 * @version v1.0
 * ​
 * @description ​
 * @date 2019-11-04 8:47
 * ​
 **/
public class Insert {
    public static void main(String[] args) throws Exception{
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        User user = new User();
        user.setId(2);
        user.setName("张");
        user.setAddress("四川");
        sqlSession.insert("insertuser", user);
        sqlSession.commit();
        sqlSession.close();
        System.out.println("添加成功，去数据库看看");
    }
}
