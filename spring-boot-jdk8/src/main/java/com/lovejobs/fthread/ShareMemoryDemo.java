package com.lovejobs.fthread;

import lombok.SneakyThrows;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Share memory demo.
 *
 * @author fengxin
 */
public class ShareMemoryDemo {
    private static int shared = 0;
    private static void incrShared(){
        shared++;
    }
    static class ChildThread extends Thread{
        List<String> list;
        public ChildThread(List<String> list){
            this.list=list;
        }

        @Override
        public void run() {
            incrShared();
            list.add(Thread.currentThread().getName());
        }
    }

    @SneakyThrows
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Thread t1 = new ChildThread(list);
        Thread t2 = new ChildThread(list);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(shared);
        System.out.println(list);
    }
}
