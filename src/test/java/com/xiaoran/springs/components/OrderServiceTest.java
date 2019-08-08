package com.xiaoran.springs.components;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = OrderServiceConfig.class )
public class OrderServiceTest {

    @Autowired
    private OrderService orderService;

    @Autowired
    private OrderItemService orderItemService;

    @Test
    public void play() {
        boolean result=orderService.getOrderItemService()==orderItemService;
        System.out.println(result ? "同一个orderitemservice" : "不同的orderitemservice");
        Assert.assertTrue(result);
    }
}
