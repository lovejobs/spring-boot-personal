package com.lovejobs;

import com.lovejobs.service.ExecutorsService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ExecutorsApplication.class)
public class ExecutorsTest {

    @Autowired
    ExecutorsService executorsService;


    @Test
    public void test(){
        //executorsService.createExecutor();
        executorsService.executeThread();
    }
}
