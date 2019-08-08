package com.xiaoran.springs.automaticAssembly;

import org.springframework.stereotype.Component;

@Component
public class AutomaticAssemblyServiceImpA implements AutomaticAssemblyService {
    @Override
    public void sayHello() {
        System.out.println("自动装配服务A");
    }
}
