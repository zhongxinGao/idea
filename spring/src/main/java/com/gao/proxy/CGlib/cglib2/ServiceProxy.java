package com.gao.proxy.CGlib.cglib2;

import org.springframework.cglib.proxy.Enhancer;
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
 * @date 2019-11-08 18:18
 * ​cglib代理
 **/
public class ServiceProxy implements MethodInterceptor {
    private ServiceImpl serviceImpl;

    public ServiceProxy(ServiceImpl serviceImpl) {
        this.serviceImpl = serviceImpl;
    }

    /**
     * 创建cglib代理对象的方法
     */
    public ServiceImpl createProxy(){
        //创建增强器
        Enhancer enhancer = new Enhancer();
        //指定父类
        enhancer.setSuperclass(ServiceImpl.class);
        //指定回调的接口对象
        enhancer.setCallback(this);
        //创建cglib代理对象
        return (ServiceImpl) enhancer.create();
    }
    /**
     * 拦截方法
     */
    public Object intercept(Object object, Method method, Object[] args, MethodProxy methodProxy)throws Throwable{
        String msg = (String)method.invoke(serviceImpl, args);
        return msg.toUpperCase();
    }
}
