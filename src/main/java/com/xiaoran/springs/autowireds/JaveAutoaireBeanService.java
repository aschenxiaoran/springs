package com.xiaoran.springs.autowireds;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component(value = "JaveAutoaireBeanService")
public class JaveAutoaireBeanService implements AutowiredBeanService {
    @Override
    public void sayHello() {
        System.out.println("这里是优先级高的自动装配！");
    }
}
