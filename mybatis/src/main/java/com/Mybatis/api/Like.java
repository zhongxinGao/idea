package com.Mybatis.api;

import com.bean.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;

/**
 * ​
 *
 * @author grow
 * ​
 * @version v1.0
 * ​
 * @description ​
 * @date 2019-11-04 10:15
 * ​
 **/
public class Like {
    public static void main(String[] args) throws Exception{
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();


        List<User> list = sqlSession.selectList("likeuser", "高");
        sqlSession.commit();
        sqlSession.close();
        System.out.println(list);
    }
}
