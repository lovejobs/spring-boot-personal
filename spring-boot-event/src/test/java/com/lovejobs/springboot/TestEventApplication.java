package com.lovejobs.springboot;

import com.lovejobs.springboot.event.ASendEvent;
import com.lovejobs.springboot.event.OrderEvent;
import com.lovejobs.springboot.event.PublishEvent;
import com.lovejobs.springboot.event.UserEvent;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = EventApplication.class)
public class TestEventApplication {

    @Autowired
    ApplicationContext context;

    @Autowired
    PublishEvent publishEvent;

    @Test
    public void test() throws InterruptedException {
        //context.publishEvent(new UserEvent(this,"这个是一个用户"));
        //context.publishEvent(new OrderEvent(this,"这是一个订单"));

        //context.publishEvent(new ASendEvent(this,"sent A"));
        for (int i=0;i<=100;i++){
            publishEvent.publishEvent();
        }

        System.out.println("--------------------------");
        Thread.sleep(10000);

    }
}
