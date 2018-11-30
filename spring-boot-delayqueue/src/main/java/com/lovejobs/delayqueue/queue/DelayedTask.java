package com.lovejobs.delayqueue.queue;

import lombok.Getter;
import lombok.Setter;

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

@Getter
@Setter
public class DelayedTask implements Delayed {

    private long executeTime;

    private String taskName;

    public DelayedTask(String taskName,long executeTime){
        this.taskName=taskName;
        this.executeTime=executeTime;
    }

    @Override
    public long getDelay(TimeUnit unit) {
        return unit.convert(executeTime - System.currentTimeMillis(), TimeUnit.MILLISECONDS);
    }

    @Override
    public int compareTo(Delayed o) {
        DelayedTask task = (DelayedTask) o;
        return executeTime > task.executeTime ? 1 : (executeTime < task.executeTime ? -1 : 0);
    }
}
