package com.lovejobs.service;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.ListeningExecutorService;
import com.google.common.util.concurrent.MoreExecutors;
import com.lovejobs.result.ResultCachedThreadTask;
import org.checkerframework.checker.units.qual.A;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class TestListeningExecutor {



    public static void main(String[] args) {
        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();

        ListeningExecutorService service = MoreExecutors.listeningDecorator(cachedThreadPool);

        List<ListenableFuture<String>> listenableFutureList = new ArrayList<ListenableFuture<String>>();

        for (int i =0;i<10;i++){
            listenableFutureList.add(service.submit(new ResultCachedThreadTask(String.valueOf(i))));
        }

        listenableFutureList.forEach(listenableFuture->{
            try {
                System.out.println(listenableFuture.get(5000, TimeUnit.MILLISECONDS));
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            } catch (TimeoutException e) {
                e.printStackTrace();
            }
        });
    }
}
