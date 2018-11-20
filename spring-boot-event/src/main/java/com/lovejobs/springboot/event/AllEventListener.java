package com.lovejobs.springboot.event;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class AllEventListener {

    @EventListener
    public void event(Object event){
        if(event instanceof OrderEvent){
            OrderEvent orderEvent = (OrderEvent) event;
            System.out.println("MyEventHandle 接收到Order事件：" + orderEvent.getMsg());
        }else if(event instanceof UserEvent){
            UserEvent userEvent = (UserEvent) event;
            System.out.println("MyEventHandle 接收到User事件：" + userEvent.getMsg());
        }
    }
}
