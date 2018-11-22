package com.lovejobs.springboot.event_1;

import com.alibaba.fastjson.JSONObject;
import com.lovejobs.springboot.model.PayOrderModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class AllActivityEventListener {

    private static Logger logger = LoggerFactory.getLogger(AllActivityEventListener.class);


    @EventListener
    public ActivityModeEvent event(Object event){
        if(event instanceof PayOrderModel){
            logger.info("AllActivityEventListener :"+ JSONObject.toJSONString(event));
            return new ActivityModeEvent(this, (PayOrderModel) event);
        }
        return null;
    }
}
