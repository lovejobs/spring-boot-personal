package com.lovejobs.springbootkafka.controller;

import com.alibaba.fastjson.JSONObject;
import com.lovejobs.springbootkafka.pojo.UserPojo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @Value("${spring.kafka.producer.topic}")
    private String topic;

    @GetMapping("/kafka/send")
    public void sendMessage1() {
        UserPojo userPojo = new UserPojo("fengxin",1,"fengxin_kafka_massage");
        kafkaTemplate.send(topic, JSONObject.toJSONString(userPojo));
    }
}
