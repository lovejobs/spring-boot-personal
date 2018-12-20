package com.lovejobs.services.rabbitmq.utils;

/**
 * 生成主键
 */
public class IdUtils {

    public static String getId(){
        SnowflakeIdWorker idWorker = new SnowflakeIdWorker(0, 0);
        return String.valueOf(idWorker.nextId());
    }
}
