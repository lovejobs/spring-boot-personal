package com.lovejobs.springboot.event;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.ApplicationEvent;

public class CSendEvent extends ApplicationEvent {

    @Getter
    @Setter
    private String sendTo;

    public CSendEvent(Object source, String sendTo) {
        super(source);
        this.sendTo=sendTo;
    }
}
