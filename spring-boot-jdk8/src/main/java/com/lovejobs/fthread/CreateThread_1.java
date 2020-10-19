package com.lovejobs.fthread;

/**
 * The type Create thread 1.
 *
 * @author fengxin
 */
public class CreateThread_1 extends Thread{
    @Override
    public void run() {
        System.out.println("thread name:"+Thread.currentThread().getName());
        System.out.println("the first create thread");
    }

    public static void main(String[] args) {
        CreateThread_1 c = new CreateThread_1();
        c.start();
        c.run();
    }
}
