package com.lovejobs.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Service;

@Service
public class ExecutorsService {

    @Autowired
    ThreadPoolTaskExecutor threadPool;

    public void executeThread(){
        ThreadPoolTaskExecutor threadPoolTaskExecutor = threadPool;
        ExecutorsThreadTask executorsThreadTask = null;
        for (int i = 0;i<=300;i++){
            System.out.println(i+" CorePoolSize:"+threadPoolTaskExecutor.getPoolSize());
            executorsThreadTask = new ExecutorsThreadTask();
            threadPoolTaskExecutor.execute(executorsThreadTask);
        }

    }
}
