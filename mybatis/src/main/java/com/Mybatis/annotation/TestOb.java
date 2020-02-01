package com.Mybatis.annotation;

import com.bean.Ob;
import com.mapper.TestMapper;
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
 * @date 2019-11-04 18:30
 * ​
 **/
public class TestOb {
    public static void main(String[] args)throws Exception {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        TestMapper testMapper = sqlSession.getMapper(TestMapper.class);
        listadd(testMapper);//查询所有
        //add(testMapper)添加
        //delete(testMapper)删除
        //update(testMapper)修改
        sqlSession.commit();
        sqlSession.close();
    }
    //增加
    private static void add(TestMapper testMapper){
        Ob ob = new Ob();
        ob.setId(2);
        ob.setName("中");
        ob.setAge(18);
        testMapper.insert(ob);
        System.out.println("添加成功");
    }
    //删除
    private static void delete(TestMapper testMapper){
        testMapper.delete(1);
        System.out.println("删除成功");
    }
    //查看所有
    private static void listadd(TestMapper testMapper){
        List<Ob> l = testMapper.list();
        for (Object i:l){
            System.out.println(i);
        }
    }
    //修改
    private static void update(TestMapper testMapper){
        Ob ob = new Ob();
        ob.setId(2);
        ob.setName("王");
        ob.setAge(20);
        testMapper.update(ob);
        System.out.println("修改成功");
    }

}

