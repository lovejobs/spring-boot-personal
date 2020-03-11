package com.lovejobs.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class TestApplication {

    @Autowired
    ApplicationContext applicationContext;

    public void test(){
        TestApplication testApplication = (TestApplication) applicationContext.getBean("testApplication");
        testApplication.testRUN();
    }

    public void testRUN(){
        System.out.println("fengxin");
    }
}
