package com.gao.proxy.CGlib.cglib1;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * ​
 *
 * @author grow
 * ​
 * @version v1.0
 * ​
 * @description ​
 * @date 2019-11-08 17:20
 * ​CGLIB动态代理
 **/
public class SportAdivce implements MethodInterceptor {
    //代理方法
    public Object intercept(Object object, Method method, Object[] args, MethodProxy methodProxy)throws Throwable{
        before();
        return methodProxy.invokeSuper(object, args);

    }

    //前置增强
    private void before(){
        System.out.println("该做什么了");
    }
    //后置增强
    private void after(){
        System.out.println("休息一下");
    }

}
