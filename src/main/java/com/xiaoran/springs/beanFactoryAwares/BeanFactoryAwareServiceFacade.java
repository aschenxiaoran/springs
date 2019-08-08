package com.xiaoran.springs.beanFactoryAwares;

import org.springframework.stereotype.Component;

/**
 * @ClassName BeanFactoryAwareServiceFacade
 * Description TODO
 * Author xiaoran
 * Date 2019/8/6 18:07
 * Version 1.0
 **/
@Component
public class BeanFactoryAwareServiceFacade  implements BeanFactoryAwareService{
    @Override
    public void sayHello() {
        getService().sayHello();
    }

    private BeanFactoryAwareService getService() {
        return BeanFactoryUtil.getBean("BeanFactoryAwareServiceImplB");
    }
}
