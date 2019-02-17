package com.lovejobs.controller;

import com.lovejobs.config.MyWebSocket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class TestController {

    @Autowired
    MyWebSocket myWebSocket;


    @RequestMapping(value = "/send",method = RequestMethod.GET)
    public String send(@RequestParam String message) {
        try {
            myWebSocket.sendInfo(message);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "success";
    }
}
