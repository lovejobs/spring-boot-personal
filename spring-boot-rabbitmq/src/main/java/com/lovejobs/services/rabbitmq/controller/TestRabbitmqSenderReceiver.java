package com.lovejobs.services.rabbitmq.controller;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;


/**
 * 生产者，消费者实现  消费服务
 */
@Component
@RabbitListener(queues = "test_account")
public class TestRabbitmqSenderReceiver {
    @RabbitHandler
    public void process(String hello) {
        System.out.println("++++++++++++++++++++++++Receiver: " + hello);
    }
}
