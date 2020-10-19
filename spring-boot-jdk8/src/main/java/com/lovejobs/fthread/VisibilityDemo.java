package com.lovejobs.fthread;

import lombok.SneakyThrows;

/**
 * The type Visibility demo.
 *
 * @author fengxin
 */
public class VisibilityDemo {
    private static boolean shutdown = false;
    static class HelloThread extends Thread{

        @Override
        public void run() {
            while (shutdown){
                //do something
            }
            System.out.println("exit hello");
        }
    }

    @SneakyThrows
    public static void main(String[] args) {
        new HelloThread().start();
        Thread.sleep(1000);
        shutdown = true;
        System.out.println("exit main");
    }
}
