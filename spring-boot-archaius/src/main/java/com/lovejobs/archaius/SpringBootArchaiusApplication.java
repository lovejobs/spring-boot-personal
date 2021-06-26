package com.lovejobs.archaius;

import com.netflix.config.DynamicPropertyFactory;
import com.netflix.config.DynamicStringProperty;
import lombok.val;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Enumeration;
import java.util.Properties;

@SpringBootApplication
public class SpringBootArchaiusApplication {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(SpringBootArchaiusApplication.class, args);
        DynamicStringProperty timeToWait = DynamicPropertyFactory.getInstance().getStringProperty("spring-boot-archaius-name", "default");
        System.out.println(timeToWait.get());
        URL systemResource = ClassLoader.getSystemResource("config.properties");
        InputStream is = ClassLoader.getSystemResourceAsStream("config.properties");
        Properties props = new Properties();
        props.load(is);
        System.out.println(props.getProperty("spring-boot-archaius-name"));
    }

}
