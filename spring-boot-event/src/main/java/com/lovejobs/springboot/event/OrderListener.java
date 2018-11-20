package com.lovejobs.springboot.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class OrderListener implements ApplicationListener<OrderEvent> {

    @Override
    public void onApplicationEvent(OrderEvent event) {
        String msg = event.getMsg();
        System.out.println("Order receive the msg : "+msg);

    }
}
