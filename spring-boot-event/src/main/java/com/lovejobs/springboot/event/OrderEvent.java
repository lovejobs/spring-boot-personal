package com.lovejobs.springboot.event;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.ApplicationEvent;

public class OrderEvent extends ApplicationEvent {

    @Getter
    @Setter
    private String msg;
    /**
     * Create a new ApplicationEvent.
     *
     * @param source the object on which the event initially occurred (never {@code null})
     */
    public OrderEvent(Object source,String msg) {
        super(source);
        this.msg=msg;
    }
}
