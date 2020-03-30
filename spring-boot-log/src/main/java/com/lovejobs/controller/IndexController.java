package com.lovejobs.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class IndexController {

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String getId(@RequestParam(name = "name") String name){
        log.info("get request paramter name:{}",name);
        log.info("response request msg:{}","Hello "+name);
        log.debug("this is debug log ");
        return "Hello "+name;

    }
}
