package com.gofun.infrastructure.elasticsearch.beanFactoryAwares;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;


@RunWith(SpringRunner.class)
@SpringBootTest
public class BeanFactoryAwareServiceTest {

    @Autowired
    private BeanFactoryAwareServiceFacade facade;

    @Test
    public void bean_factory_aware_service_test(){

        facade.sayHello();
    }
}
