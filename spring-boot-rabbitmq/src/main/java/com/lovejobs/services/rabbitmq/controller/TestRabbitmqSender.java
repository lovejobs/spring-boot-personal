package com.lovejobs.services.rabbitmq.controller;


import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

/**
 * 生产者，消费者实现  接收服务
 * 多生产者、多消费者 也一样
 */
@Controller
@RequestMapping(value = "/rabbitmq")
public class TestRabbitmqSender {



    @Autowired
    private AmqpTemplate rabbitTemplate;

    @RequestMapping(value = "/send",method = RequestMethod.GET)
    @ResponseBody
    public String send() {
        String context = "hello " + new Date();
        System.out.println("++++++++++++++++++++++++Sender : " + context);
        this.rabbitTemplate.convertAndSend("test_account", context);
        return "true";
    }



}
