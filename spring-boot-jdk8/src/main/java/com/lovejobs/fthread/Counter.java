package com.lovejobs.fthread;

/**
 * The type Counter.
 *
 * @author fengxin
 */
public class Counter {
    private int count;
    public synchronized void incr(){
        count++;
    }
    public synchronized int getCount(){
        return count;
    }
}
