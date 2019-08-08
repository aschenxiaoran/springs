package com.xiaoran.springs.components;

public interface OrderService {

    void setOrderItemService(OrderItemService orderItemService);

    OrderItemService getOrderItemService();

    void play();
}
