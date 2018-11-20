package com.lovejobs.springboot.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class PublishEvent {

    @Autowired
    ApplicationContext context;

    @Async
    public void publishEvent(){
        context.publishEvent(new ASendEvent(this,"sent A"));
        System.out.println("++++++++++++++++++++++");
    }
}
