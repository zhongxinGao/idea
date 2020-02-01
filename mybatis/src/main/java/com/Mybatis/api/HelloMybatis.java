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
 * @date 2019-11-01 17:55
 * ​
 **/
public class HelloMybatis {
    public static void main(String[] args) throws Exception {
        //指定全局配置文件
        String resource = "mybatis-config.xml";
        //读取配置文件
    InputStream inputStream = Resources.getResourceAsStream(resource);
    //构建sqlSessionFactory
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    //获取sqlSession
    SqlSession sqlSession = sqlSessionFactory.openSession();

    User user = sqlSession.selectOne("selectid", 1);
		System.out.println(user);
		sqlSession.commit();
		sqlSession.close();
    }
}
