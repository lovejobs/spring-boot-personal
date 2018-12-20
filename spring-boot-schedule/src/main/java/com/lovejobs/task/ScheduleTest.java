package com.lovejobs.task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * Created by Administrator on 2018/4/21.
 */
@Component
public class ScheduleTest {

    private static Logger logger = LoggerFactory.getLogger(ScheduleTest.class);

    private static AtomicBoolean TRANS_QUERY_FlAG = new AtomicBoolean(false);


    @Scheduled(cron = "*/2 * * * * ?")
    public void run(){
        if(!TRANS_QUERY_FlAG.getAndSet(true)) {
            try {
                System.out.println(Thread.currentThread()+"begin schedule");
                //Thread.sleep(10000);
                TRANS_QUERY_FlAG.getAndSet(false);
            } catch (Exception e) {
                logger.error("transaction query error", e);
            }finally {
                TRANS_QUERY_FlAG.getAndSet(false);
            }
        }
    }

}
