package com.gao.proxy.JDK.jdk1;

import org.springframework.cglib.proxy.InvocationHandler;
import org.springframework.cglib.proxy.Proxy;

import java.lang.reflect.Method;

/**
 * ​
 *
 * @author grow
 * ​
 * @version v1.0
 * ​
 * @description ​
 * @date 2019-11-08 18:03
 * ​
 **/
public class ServiceProxy {
    public static void main(String[] args) {
        final Service service = new ServiceImpl();
        //获取静态代理对象
        Service s = (Service) Proxy.newProxyInstance(service.getClass().getClassLoader(),//实现类的列加载器
                service.getClass().getInterfaces(),//实现类 实现所有的接口

                new InvocationHandler() { //处理器
                        //object代理对象 method目标方法 args目标方法参数
                    public Object invoke(Object object, Method method, Object[] args) throws Throwable {
                        String msg = (String) method.invoke(service, args);
                        return msg.toUpperCase();
                    }
                });
        System.out.println(s.service());
    }
}
