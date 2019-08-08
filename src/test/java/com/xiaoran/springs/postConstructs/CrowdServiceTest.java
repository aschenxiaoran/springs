package com.xiaoran.springs.postConstructs;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.PostConstruct;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CrowdServiceTest {

    @Autowired
    private CrowdService crowdService;

    public CrowdServiceTest() {
        System.out.println("构造函数执行，此时crowdService还没被执行=" + crowdService);
    }

    @PostConstruct
    private void init() {
        System.out.println("此时crowdSrevice在依赖注入后将被自动调用，此时crowdService=" + crowdService);
    }

    @Test
    public void test() {
    }

    @Test
    public void test2() {

        CrowdServiceTest test = new CrowdServiceTest();
    }
}
