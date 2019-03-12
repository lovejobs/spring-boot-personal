package com.lovejobs.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class SSEController {


    /**
     * "text/event-stream; charset=UTF-8"表明支持SSE这一服务器端推送技术，
     * @return 服务端向浏览器推送的消息，具有一定的格式要求，详见SSE说明
     */
    @RequestMapping(value = "/push",produces = "text/event-stream; charset=UTF-8")
    @ResponseBody
    @CrossOrigin
    public String push(){
        Random random = new Random();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        return "data:This is a test data " + random.nextInt() + "\n\n";
    }
}
