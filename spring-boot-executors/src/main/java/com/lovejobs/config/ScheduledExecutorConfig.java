package com.lovejobs.config;

import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

@Configuration
public class ScheduledExecutorConfig {

    private ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();


    @PostConstruct
    private void init() {
        executorService.scheduleWithFixedDelay(() -> {
            try {
                System.out.println("fengxin");
            } catch (Exception e) {
                //warn
            }
        }, 10, 10, TimeUnit.MILLISECONDS);
    }


    public static void main(String[] args) {
        ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();

        executorService.scheduleWithFixedDelay(() -> {
            try {
                System.out.println("fengxin");
            } catch (Exception e) {
                //warn
            }
        }, 10, 10, TimeUnit.SECONDS);
    }
}
