package com.lovejobs.fthread;

import lombok.SneakyThrows;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * The type My blocking queue.
 *
 * @param <E> the type parameter
 * @author fengxin
 */
public class MyBlockingQueue<E> {
    private Queue<E> queue = null;
    private int limit;

    public MyBlockingQueue(int limit) {
        this.limit = limit;
        queue = new ArrayDeque<>(limit);
    }

    @SneakyThrows
    public synchronized void put(E e){
        while (queue.size() == limit){
            wait();
        }
        queue.add(e);
        notifyAll();
    }

    @SneakyThrows
    public synchronized E take(){
        while (queue.isEmpty()){
            wait();
        }
        E e = queue.poll();
        notifyAll();
        return e;
    }

    static class Producer extends Thread{
        MyBlockingQueue<String> queue;

        public Producer(MyBlockingQueue<String> queue) {
            this.queue = queue;
        }

        @SneakyThrows
        @Override
        public void run() {
            int num = 0;
            while (true){
                String task = String.valueOf(num);
                queue.put(task);
                System.out.println("produce task " + task);
                num++;
                Thread.sleep((long) (Math.random()*100));
            }
        }
    }

    static class Consumer extends Thread{
        MyBlockingQueue<String> queue;

        public Consumer(MyBlockingQueue<String> queue) {
            this.queue = queue;
        }

        @SneakyThrows
        @Override
        public void run() {
            int num = 0;
            while (true){
                String task = queue.take();
                System.out.println("handle task " + task);
                Thread.sleep((long) (Math.random()*100));
            }
        }
    }

    public static void main(String[] args) {
        MyBlockingQueue<String> queue = new MyBlockingQueue<>(10);
        new Producer(queue).start();
        new Consumer(queue).start();
    }
}
