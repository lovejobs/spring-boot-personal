package com.lovejobs.service;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.ListeningExecutorService;
import com.google.common.util.concurrent.MoreExecutors;
import com.lovejobs.result.ResultCachedThreadTask;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestFutherExecutor {



    public static void main(String[] args) {
        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();

        List<Future<String>> list = new ArrayList<>();

        for (int i =0;i<10;i++){
            list.add(cachedThreadPool.submit(new ResultCachedThreadTask(String.valueOf(i))));

        }

        list.forEach(listenableFuture->{
            try {
                System.out.println(listenableFuture.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        });
    }
}
