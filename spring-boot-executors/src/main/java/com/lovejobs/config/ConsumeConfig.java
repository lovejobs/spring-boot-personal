package com.lovejobs.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Administrator on 2018/4/12.
 */
@Configuration
public class ConsumeConfig {

    @Bean
    public ThreadPoolTaskExecutor threadPool(){
        ThreadPoolTaskExecutor threadPoolTaskExecutor = new ThreadPoolTaskExecutor();
        threadPoolTaskExecutor.setCorePoolSize(6);
        threadPoolTaskExecutor.setKeepAliveSeconds(30000);
        threadPoolTaskExecutor.setMaxPoolSize(10);
        //threadPoolTaskExecutor.setQueueCapacity(100);
        return threadPoolTaskExecutor;
    }

}
