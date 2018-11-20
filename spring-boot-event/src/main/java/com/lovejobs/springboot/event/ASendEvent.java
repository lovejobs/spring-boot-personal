package com.lovejobs.springboot.event;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.ApplicationEvent;

public class ASendEvent extends ApplicationEvent {

    @Getter
    @Setter
    private String sendTo;

    public ASendEvent(Object source,String sendTo) {
        super(source);
        this.sendTo=sendTo;
    }
}
