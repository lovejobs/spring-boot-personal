package com.lovejobs.result;

import java.util.concurrent.Callable;

public class ResultCachedThreadTask implements Callable {

    private String name;

    public ResultCachedThreadTask(String name) {
        this.name = name;
    }


    @Override
    public String call() throws Exception {
        if(name .equals("2")){
            Thread.sleep(10000);
        }
        return this.name;
    }
}
