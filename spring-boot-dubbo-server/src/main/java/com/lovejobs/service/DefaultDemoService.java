package com.lovejobs.service;

import com.lovejobs.api.DemoService;
import org.apache.dubbo.config.annotation.Service;

@Service(version = "1.0.0")
public class DefaultDemoService implements DemoService {
    @Override
    public String sayHello(String name) {
        return "Hello "+ name;
    }
}
