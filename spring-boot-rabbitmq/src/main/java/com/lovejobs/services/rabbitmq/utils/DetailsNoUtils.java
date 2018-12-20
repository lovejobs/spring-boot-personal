package com.lovejobs.services.rabbitmq.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *  生产业务唯一流水号
 */
public class DetailsNoUtils {

    public static String getDetailNo(){
        SnowflakeIdWorker idWorker = new SnowflakeIdWorker(0, 0);
        String no = null;
        String date = new SimpleDateFormat("yyyyMMdd").format(new Date());
        String seconds = new SimpleDateFormat("HHmmss").format(new Date());
        return date+seconds+idWorker.nextId();

    }



    public static void main(String args[]){
        System.out.println(getDetailNo());
    }
}
