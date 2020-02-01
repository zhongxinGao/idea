package com.gao.proxy.static0.static2;

/**
 * ​
 *
 * @author grow
 * ​
 * @version v1.0
 * ​
 * @description ​
 * @date 2019-11-08 17:04
 * ​代理类
 **/
public class ServiceProxy implements Service {
    private ServiceImpl serviceImpl;

    public ServiceProxy(ServiceImpl serviceImpl) {
        this.serviceImpl = serviceImpl;
    }

    /**
     * 增强方法
     * 返回结果转化为大写
     */
    public String service(){
        return serviceImpl.service().toUpperCase();
    }

    public static void main(String[] args) {
    ServiceImpl s = new ServiceImpl();
    ServiceProxy serviceProxy = new ServiceProxy(s);
        System.out.println(serviceProxy.service());
    }
}
