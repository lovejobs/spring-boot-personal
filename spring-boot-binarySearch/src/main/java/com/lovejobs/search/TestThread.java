package com.lovejobs.search;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class TestThread {

    public static void main(String[] args) {
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(6);
        executorService.scheduleWithFixedDelay(() -> {
            try {
                System.out.println("111111111111111111");
            } catch (Exception e) {
                //warn
            }
        }, 1, 1, TimeUnit.MILLISECONDS);
        executorService.scheduleWithFixedDelay(() -> {
            try {
                System.out.println("222222222222222222");
            } catch (Exception e) {
                //warn
            }
        }, 1, 1, TimeUnit.MILLISECONDS);
        executorService.scheduleWithFixedDelay(() -> {
            try {
                System.out.println("3333333333333333333");
            } catch (Exception e) {
                //warn
            }
        }, 1, 1, TimeUnit.MILLISECONDS);
        executorService.scheduleWithFixedDelay(() -> {
            try {
                System.out.println("44444444444444444444");
            } catch (Exception e) {
                //warn
            }
        }, 1, 1, TimeUnit.MILLISECONDS);
        executorService.scheduleWithFixedDelay(() -> {
            try {
                System.out.println("55555555555555555555");
            } catch (Exception e) {
                //warn
            }
        }, 1, 1, TimeUnit.MILLISECONDS);
        executorService.scheduleWithFixedDelay(() -> {
            try {
                System.out.println("66666666666666666666");
            } catch (Exception e) {
                //warn
            }
        }, 1, 1, TimeUnit.MILLISECONDS);
    }
}
