package com.lovejobs.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

import javax.annotation.PostConstruct;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

@Configuration
public class CachedThreadConfig {

    private ExecutorService cachedThreadPool = Executors.newCachedThreadPool();

    @PostConstruct
    private void init(){
        cachedThreadPool.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("cache thread pool runing");
            }
        });
    }

}
