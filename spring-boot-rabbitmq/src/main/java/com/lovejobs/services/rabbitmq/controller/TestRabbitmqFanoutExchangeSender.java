package com.lovejobs.services.rabbitmq.controller;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;


/**
 * Exchange 模式 - fanout
 *
 * exchange       routing key     quene
 *
 * test_fanout     无             fanout_1
 *
 * test_fanout     无             fanout_2
 *
 * test_fanout     无             fanout_3
 *
 * 以下代码 再三个队列中都有消息 类似广播
 *
 */
@Controller
@RequestMapping(value = "/rabbitmq")
public class TestRabbitmqFanoutExchangeSender {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    @RequestMapping(value = "/send_fanout",method = RequestMethod.GET)
    @ResponseBody
    public String send() {
        String context = "hello " + new Date();
        System.out.println("++++++++++++++++++++++++Sender : " + context);
        this.rabbitTemplate.convertAndSend("test_fanout","", context);
        return "true";
    }
}
