package com.gofun.infrastructure.elasticsearch.components;


import org.springframework.stereotype.Component;

@Component
public class OrderServiceImpl implements OrderService {
    @Override
    public void play() {
        System.out.println("测试component组件");
    }
}
