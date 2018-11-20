package com.lovejobs.springboot.event;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class BListener {

    @EventListener
    public CSendEvent process(BSendEvent bSendEvent){
        System.out.println("I am B, and receive msg is :"+bSendEvent.getSendTo());
        return new CSendEvent(this,"sent C");
    }
}
