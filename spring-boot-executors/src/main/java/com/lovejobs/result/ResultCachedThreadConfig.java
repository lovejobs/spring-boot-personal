package com.lovejobs.result;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@Configurable
public class ResultCachedThreadConfig {

    private ExecutorService cachedThreadPool = Executors.newCachedThreadPool();

    ArrayList<Future<String>> results = new ArrayList<Future<String>>();

    @PostConstruct
    public void initCachedThread(){
        for (int i =0;i<10;i++){
            results.add(cachedThreadPool.submit(new ResultCachedThreadTask(Thread.currentThread().getName())));
        }

        cachedThreadPool.shutdown();
        results.forEach(stringFuture -> {
            try {
                System.out.println("CachedThreadPool  result is {}"+stringFuture.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        });
    }

    public static void main(String[] args) {
        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();

        ArrayList<Future<String>> results = new ArrayList<Future<String>>();
        for (int i =0;i<10;i++){
            results.add(cachedThreadPool.submit(new ResultCachedThreadTask(String.valueOf(i))));
        }

        cachedThreadPool.shutdown();
        results.forEach(stringFuture -> {
            try {
                System.out.println("CachedThreadPool  result is {}"+stringFuture.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        });
    }
}
