package com.lovejobs;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@ServletComponentScan
@SpringBootApplication
public class DataSourceApplication {


	public static void main(String[] args) {
		SpringApplication.run(DataSourceApplication.class, args);
	}


}
