package com.lovejobs.annotation;

import org.springframework.stereotype.Service;

@Service
@Feng
public class FengBService implements FengService {
    @Override
    public String sayHello(String name) {
        return "Hello B:"+name;
    }
}
