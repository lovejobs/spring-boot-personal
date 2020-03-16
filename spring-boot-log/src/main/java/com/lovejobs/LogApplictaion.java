package com.lovejobs;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class LogApplictaion {
    public static void main(String[] args) {
        log.debug("fengxin:{}","fasfdaf");
        SpringApplication.run(LogApplictaion.class, args);
    }
}
