package com.gofun.infrastructure.elasticsearch;

import com.gofun.infrastructure.elasticsearch.beans.Order;
import com.gofun.infrastructure.elasticsearch.utils.SpringUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {

        ApplicationContext context=new AnnotationConfigApplicationContext("com.gofun.infrastructure.elasticsearch");


        Order order1= SpringUtils.getBean(Order.class);
        String userName=order1.getUserName();


        Order order=context.getBean(Order.class);
        System.out.println("测试"+order.getUserName());

        SpringApplication.run(Application.class, args);
    }

}
