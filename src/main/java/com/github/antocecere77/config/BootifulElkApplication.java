package com.github.antocecere77.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@ComponentScan(basePackages = "com.github.antocecere77")
public class BootifulElkApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootifulElkApplication.class, args);
	}

}
