package com.xiaoran.springs.autowireds;

import org.springframework.stereotype.Component;

@Component
public class CAutoaireBeanService implements AutowiredBeanService {
    @Override
    public void sayHello() {
        System.out.println("这里是c语音装配");
    }
}
