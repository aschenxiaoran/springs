package com.xiaoran.springs.dynamicProxys;

/**
 * @ClassName DynamicProxyHelloImpl
 * Description TODO
 * Author xiaoran
 * Date 2019/8/19 14:59
 * Version 1.0
 **/
public class DynamicProxyHelloImpl implements DynamicProxyHello {
    @Override
    public void sayHello() {
        System.out.println("这里是动态代理实验！");
    }
}
