package com.xiaoran.springs.components;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName OrderServiceConfiguration
 * Description TODO
 * Author xiaoran
 * Date 2019/8/6 9:17
 * Version 1.0
 **/
@Configuration
public class OrderServiceConfig {


    @Bean
    public OrderService orderService(){

        OrderServiceImpl orderService= new OrderServiceImpl();

        orderService.setOrderItemService(orderItemService());

        return orderService;
    }

    @Bean
    public OrderItemService orderItemService(){

        return new OrderItemServiceImpl();
    }

}
