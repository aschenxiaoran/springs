package com.gofun.infrastructure.elasticsearch.components;


import org.springframework.stereotype.Component;

@Component
public class OrderServiceImpl implements OrderService {


    private OrderItemService orderItemService;

    @Override
    public void play() {
        System.out.println("测试component组件");
    }

    public void setOrderItemService(OrderItemService orderItemService) {
        this.orderItemService = orderItemService;
    }

    public OrderItemService getOrderItemService(){
        return orderItemService;
    }
}
