package com.xiaoran.springs.reflections;

import java.util.Optional;

/**
 * @ClassName ReflectionClass
 * Description TODO
 * Author xiaoran
 * Date 2019/8/19 11:51
 * Version 1.0
 **/
public class ReflectionClass {

    public ReflectionClass getReflectionClass() {
        ReflectionClass class1 = new ReflectionClass();
        ReflectionClass class2 = new ReflectionClass();
        return Optional.ofNullable(class1).orElse(class2);

    }

    public String sayHello(String helloOwner) {
        System.out.println("进入方法");
        final String backValue = "这个是xiaoran在测试反色";
        return Optional.ofNullable(helloOwner).orElse(backValue);
    }

}
