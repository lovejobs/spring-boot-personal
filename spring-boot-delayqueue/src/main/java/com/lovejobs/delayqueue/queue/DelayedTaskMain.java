package com.lovejobs.delayqueue.queue;

import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;

public class DelayedTaskMain {

    private static DelayQueue delayQueue  = new DelayQueue();

    public static void main(String[] args) throws InterruptedException {

        new Thread(new Runnable() {
            @Override
            public void run() {
                delayQueue.offer(new DelayedTask("1",100));
                delayQueue.offer(new DelayedTask("2",1000));
                delayQueue.offer(new DelayedTask("3",10002));
                delayQueue.offer(new DelayedTask("4",10001));
                delayQueue.offer(new DelayedTask("5",10003));
                delayQueue.offer(new DelayedTask("6",100040000));
            }
        }).start();


        DelayedTask take = (DelayedTask)delayQueue.take();

        System.out.println(take.getTaskName());

        DelayedTask take2 = (DelayedTask)delayQueue.take();

        System.out.println(take2.getTaskName());

    }
}
