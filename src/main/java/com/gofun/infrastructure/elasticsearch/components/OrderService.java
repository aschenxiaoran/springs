package com.gofun.infrastructure.elasticsearch.components;

public interface OrderService {

    void setOrderItemService(OrderItemService orderItemService);

    OrderItemService getOrderItemService();

    void play();
}
