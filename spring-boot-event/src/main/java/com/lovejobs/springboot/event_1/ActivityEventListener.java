package com.lovejobs.springboot.event_1;

import com.alibaba.fastjson.JSONObject;
import com.lovejobs.springboot.model.PayOrderModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class ActivityEventListener {

    private static Logger logger = LoggerFactory.getLogger(ActivityEventListener.class);


    @EventListener
    public void event(ActivityModeEvent activityModeEvent){
        logger.info("ActivityEventListener :"+ JSONObject.toJSONString(activityModeEvent));
    }
}
