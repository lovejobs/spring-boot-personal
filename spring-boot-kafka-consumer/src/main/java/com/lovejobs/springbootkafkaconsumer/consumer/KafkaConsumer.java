package com.lovejobs.springbootkafkaconsumer.consumer;

import com.alibaba.fastjson.JSONArray;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class KafkaConsumer {
    @KafkaListener(topics = "${spring.kafka.consumer.topic}")
    public void onMessage_1(ConsumerRecord<?, ?> record){
        // 消费的哪个topic、partition的消息,打印出消息内容
        System.out.println("consumer received message："+record.topic()+"-"+record.partition()+"-"+record.value());
    }

    @KafkaListener(topics = "${spring.kafka.consumer.topic}")
    public void onMessage_2(String msg){
        // 消费的哪个topic、partition的消息,打印出消息内容
        System.out.println("consumer received message：" + msg);
    }

    @KafkaListener(topics = "${spring.kafka.consumer.topic}")
    public void onMessage_3(List<String> msg){
        // 消费的哪个topic、partition的消息,打印出消息内容
        System.out.println("consumer received message："+ JSONArray.toJSONString(msg));
    }

}
