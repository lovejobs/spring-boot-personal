package com.lovejobs.service;

public class ExecutorsThreadTask implements Runnable{
    @Override
    public void run() {
        try {
            Thread.sleep(100000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
