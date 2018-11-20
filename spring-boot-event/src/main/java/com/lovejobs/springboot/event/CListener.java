package com.lovejobs.springboot.event;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class CListener {

    @EventListener
    public void process(CSendEvent cSendEvent){
        System.out.println("I am C, and receive msg is :"+cSendEvent.getSendTo());
    }
}
