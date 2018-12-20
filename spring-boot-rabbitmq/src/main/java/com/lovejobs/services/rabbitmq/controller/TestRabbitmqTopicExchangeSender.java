package com.lovejobs.services.rabbitmq.controller;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;


/**
 * Exchange 模式 - topic
 *
 * exchange       routing key    quene
 *
 * test_topic     user.#         topic_1
 *
 * test_topic     account.#      topic_2
 *
 * test_topic     order.#        topic_3
 *
 *
 * 以下代码只有队列topic_1有消息
 *
 */
@Controller
@RequestMapping(value = "/rabbitmq")
public class TestRabbitmqTopicExchangeSender {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    @RequestMapping(value = "/send_topic",method = RequestMethod.GET)
    @ResponseBody
    public String send() {
        String context = "hello " + new Date();
        System.out.println("++++++++++++++++++++++++Sender : " + context);
        this.rabbitTemplate.convertAndSend("test_topic","user.score", context);
        return "true";
    }
}
