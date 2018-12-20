package com.lovejobs;


import com.lovejobs.filter.RequestZuulFilter;
import com.lovejobs.filter.ResponseZuulFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableZuulProxy
public class Application {

	@Bean
	public RequestZuulFilter requestZuulFilter(){
		return new RequestZuulFilter();
	}

	@Bean
	public ResponseZuulFilter responseZuulFilter(){
		return new ResponseZuulFilter();
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
