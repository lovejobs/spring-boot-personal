package com.lovejobs.springboot;

import com.lovejobs.springboot.drools.service.DroolsService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DroolsApplication.class)
public class TestDroolsApplication {

    @Autowired
    ApplicationContext context;

    @Autowired
    DroolsService droolsService;



    @Test
    public void test(){
        System.out.println("result is :"+droolsService.fireRule());
    }
}
