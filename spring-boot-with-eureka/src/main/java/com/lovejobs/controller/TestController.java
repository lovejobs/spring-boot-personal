package com.lovejobs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping(value = "/test")
public class TestController {

    @RequestMapping(value = "/eureka",method = RequestMethod.GET)
    @ResponseBody
    public String TestEureka(){
        return "this is spring-boot-with-eureka";
    }
}
