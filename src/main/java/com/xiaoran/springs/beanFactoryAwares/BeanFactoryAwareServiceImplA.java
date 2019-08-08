package com.xiaoran.springs.beanFactoryAwares;

import org.springframework.stereotype.Service;

/**
 * @ClassName BeanFactoryAwareServiceImplA
 * Description TODO
 * Author xiaoran
 * Date 2019/8/6 17:53
 * Version 1.0
 **/
@Service("BeanFactoryAwareServiceImplA")
public class BeanFactoryAwareServiceImplA implements BeanFactoryAwareService {
    @Override
    public void sayHello() {
        System.out.println("这是BeanFactoryAwareService A");
    }
}
