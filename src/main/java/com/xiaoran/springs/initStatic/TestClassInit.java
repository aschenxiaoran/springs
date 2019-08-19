package com.xiaoran.springs.initStatic;

/**
 * @ClassName TestClassInit
 * Description TODO
 * Author xiaoran
 * Date 2019/8/14 11:17
 * Version 1.0
 **/
public class TestClassInit {

    static {
        System.out.println("这里是类加载的初始化阶段");
    }

    public void test(){
        System.out.println("测试");
    }
}
