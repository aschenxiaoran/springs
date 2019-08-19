package com.xiaoran.springs.dynamicProxys;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DynamicProxyHelloImplTest {

    @Test
    public void sayHello() {

        DynamicProxyHello hello=(DynamicProxyHello)new DynamicProxy().bind(new DynamicProxyHelloImpl());
        hello.sayHello();

    }
}
