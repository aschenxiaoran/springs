package com.xiaoran.springs.initStatic;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestClassInitTest {

    @Test
    public void test1() {

        TestClassInit testClassInit=new TestClassInit();
        TestClassInit testClassInit1=new TestClassInit();
        testClassInit.test();
        testClassInit1.test();


    }
}
