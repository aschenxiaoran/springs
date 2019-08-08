package com.xiaoran.springs.automaticAssembly;

import org.springframework.stereotype.Component;

@Component
public class AutomaticAssemblyServiceImpB implements AutomaticAssemblyService {
    @Override
    public void sayHello() {
        System.out.println("这是自动装配服务B");
    }
}
