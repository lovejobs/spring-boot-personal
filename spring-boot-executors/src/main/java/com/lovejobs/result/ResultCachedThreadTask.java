package com.lovejobs.result;

import java.util.concurrent.Callable;

public class ResultCachedThreadTask implements Callable {

    private String name;

    public ResultCachedThreadTask(String name) {
        this.name = name;
    }


    @Override
    public String call() throws Exception {
        return this.name;
    }
}
