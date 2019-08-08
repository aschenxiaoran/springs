package com.xiaoran.springs.beanFactoryAwares;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @ClassName CustomerBeanFactoryAware
 * Description TODO
 * Author xiaoran
 * Date 2019/8/6 17:50
 * Version 1.0
 **/
@Component
public class BeanFactoryUtil implements BeanFactoryAware {

    private static BeanFactory beanFactory;

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory=beanFactory;
    }

    public static   <T>T getBean(String beanName){
        if(null!=beanFactory){
            return (T)beanFactory.getBean(beanName);
        }
        return null;
    }
}
