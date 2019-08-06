package com.gofun.infrastructure.elasticsearch.utils;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class SpringUtils implements ApplicationContextAware {

    private static ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext appContext) throws BeansException {
        System.out.println("applicationContext正在初始化,application:"+appContext);
            SpringUtils.applicationContext =appContext;
    }

    public static <T>T getBean(Class<T> clazz){
        if(applicationContext==null){
            System.out.println("applicationContext是空的");
        }else{
            System.out.println("applicationContext不是空的");
        }
        return applicationContext.getBean(clazz);

    }
}
