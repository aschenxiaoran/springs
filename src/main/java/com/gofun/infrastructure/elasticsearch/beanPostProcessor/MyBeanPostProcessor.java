package com.gofun.infrastructure.elasticsearch.beanPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @ClassName MyBeanPostProcessor
 * Description TODO
 * Author xiaoran
 * Date 2019/8/6 9:37
 * Version 1.0
 **/
public class MyBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("对象："+beanName+"开始初始化");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("对象："+beanName+"初始化完成");
        return bean;
    }

}
