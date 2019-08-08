package com.xiaoran.springs.beanFactoryAwares;

import org.springframework.stereotype.Service;

/**
 * @ClassName BeanFactoryAwareServiceImplB
 * Description TODO
 * Author xiaoran
 * Date 2019/8/6 17:54
 * Version 1.0
 **/
@Service("BeanFactoryAwareServiceImplB")
public class BeanFactoryAwareServiceImplB implements BeanFactoryAwareService {

    @Override
    public void sayHello() {

        System.out.println("这里是BeanFactoryAwareService B");
    }
}
