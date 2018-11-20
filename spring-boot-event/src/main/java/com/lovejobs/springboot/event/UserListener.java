package com.lovejobs.springboot.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class UserListener implements ApplicationListener<UserEvent> {

    @Override
    public void onApplicationEvent(UserEvent event) {
        String msg = event.getMsg();
        System.out.println("User receive the msg : "+msg);
    }
}
