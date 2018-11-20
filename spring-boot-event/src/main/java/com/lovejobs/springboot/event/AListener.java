package com.lovejobs.springboot.event;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class AListener {

    @EventListener
    public BSendEvent process(ASendEvent aSendEvent){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("I am A, and receive msg is :"+aSendEvent.getSendTo());
        return new BSendEvent(this,"sent B");
    }
}
