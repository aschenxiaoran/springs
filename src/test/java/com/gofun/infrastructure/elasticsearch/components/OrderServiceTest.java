package com.gofun.infrastructure.elasticsearch.components;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes =OrderServiceConfig.class )
public class OrderServiceTest {

    @Autowired
    private OrderService orderService;

    @Test
    public void play() {
        orderService.play();
        Assert.assertNotNull(orderService);
    }
}