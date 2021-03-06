package com.lovejobs.redis.msg;

import com.lovejobs.redis.msg.service.PublisherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("publisher")
public class controller {

    @Autowired
    private PublisherService publisherService;

    @RequestMapping("{name}")
    public String sendMessage(@PathVariable("name") String name) {
        return publisherService.sendMessage(name);
    }

}
