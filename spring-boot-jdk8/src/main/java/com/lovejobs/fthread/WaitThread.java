package com.lovejobs.fthread;

import lombok.SneakyThrows;

/**
 * The type Wait thread.
 *
 * @author fengxin
 */
public class WaitThread extends Thread {
    private volatile boolean fire = false;

    @SneakyThrows
    @Override
    public void run() {
        synchronized (this){
            while (!fire){
                wait();
            }
        }
        System.out.println("fired");
    }

    public synchronized void fire(){
        this.fire = true;
        notify();
    }

    @SneakyThrows
    public static void main(String[] args) {
        WaitThread waitThread  = new WaitThread();
        waitThread.start();
        Thread.sleep(1000);
        System.out.println("fire");
        waitThread.fire();

    }
}

