package com.lovejobs.fthread;

import jdk.nashorn.internal.objects.NativeUint8Array;
import lombok.SneakyThrows;

/**
 * The type Counter thread.
 *
 * @author fengxin
 */
public class CounterThread extends Thread{

    Counter counter;

    public CounterThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i =0;i<1000;i++){
            counter.incr();
        }
    }

    @SneakyThrows
    public static void main(String[] args) {
        int num = 1000;
        Counter counter = new Counter();
        Thread[] threads = new Thread[num];
        for(int i =0;i<num;i++){
            threads[i]= new CounterThread(counter);
            threads[i].start();
        }
        for (int i=0;i<num;i++){
            threads[i].join();
        }
        System.out.println(counter.getCount());
    }
}
