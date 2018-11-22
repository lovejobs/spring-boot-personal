package com.lovejobs.springboot.event_1;

import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class CashBackActivityEventListener {

    private static Logger logger = LoggerFactory.getLogger(CashBackActivityEventListener.class);


    @EventListener
    public void event(ActivityModeEvent activityModeEvent){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        logger.info("CashBackActivityEventListener :"+ JSONObject.toJSONString(activityModeEvent));
    }
}
