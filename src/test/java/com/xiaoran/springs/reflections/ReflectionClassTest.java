package com.xiaoran.springs.reflections;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ReflectionClassTest {

    @Test
    public void sayHello() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class<?> classReflected=Class.forName("com.xiaoran.springs.reflections.ReflectionClass");
        ReflectionClass reflectionClass=(ReflectionClass)classReflected.newInstance();
        System.out.println(reflectionClass.sayHello(null));


    }
}
