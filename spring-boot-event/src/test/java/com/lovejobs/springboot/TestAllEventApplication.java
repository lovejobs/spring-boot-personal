package com.lovejobs.springboot;

import com.lovejobs.springboot.event.PublishEvent;
import com.lovejobs.springboot.model.PayOrderModel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = EventApplication.class)
public class TestAllEventApplication {

    @Autowired
    ApplicationContext context;

    @Test
    public void test() throws InterruptedException {
        PayOrderModel payOrderModel =  new PayOrderModel();
        payOrderModel.setAmount(100);
        payOrderModel.setPayOrderNo("feng12312312");
        for (int i =0 ;i<100;i++) {
            context.publishEvent(payOrderModel);
        }

    }
}
