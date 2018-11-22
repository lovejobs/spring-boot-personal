package com.lovejobs.springboot.event_1;

import com.lovejobs.springboot.model.PayOrderModel;
import lombok.Getter;
import lombok.Setter;
import org.springframework.context.ApplicationEvent;

public class ActivityModeEvent extends ApplicationEvent {

    @Getter
    @Setter
    private PayOrderModel payOrderModel;
    /**
     * Create a new ApplicationEvent.
     *
     * @param source the object on which the event initially occurred (never {@code null})
     */
    public ActivityModeEvent(Object source,PayOrderModel payOrderModel) {
        super(source);
        this.payOrderModel=payOrderModel;
    }
}
