package com.lovejobs.fthread;

/**
 * The type Create thread 1.
 *
 * @author fengxin
 */
public class CreateThread_2 implements Runnable{

    @Override
    public void run() {
        System.out.println("thread name:"+Thread.currentThread().getName());
        System.out.println("the first create thread");
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new CreateThread_2());
        thread.start();
        thread.run();
    }
}
