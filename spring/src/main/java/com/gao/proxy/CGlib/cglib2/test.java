package com.gao.proxy.CGlib.cglib2;

/**
 * ​
 *
 * @author grow
 * ​
 * @version v1.0
 * ​
 * @description ​
 * @date 2019-11-08 18:44
 * ​
 **/
public class test {
    public static void main(String[] args) {
        //定义目标对象
        ServiceImpl service = new ServiceImpl();
        //获取代理对象
        ServiceImpl s = new ServiceProxy(service).createProxy();
        System.out.println(s.service());
    }
}
