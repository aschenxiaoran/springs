package com.xiaoran.springs.dynamicProxys;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @ClassName DynamicProxy
 * Description TODO
 * Author xiaoran
 * Date 2019/8/19 15:00
 * Version 1.0
 **/
public class DynamicProxy implements InvocationHandler {

    Object orignalObject;

    Object bind(Object orignalObject){
        this.orignalObject=orignalObject;
        return Proxy.newProxyInstance(orignalObject.getClass().getClassLoader(),orignalObject.getClass().getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("这里是代理类执行的代码！");
        return method.invoke(orignalObject,args);
    }
}
