package com.redis.sbredisexample;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
//import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
//@ComponentScan("com.redis.sbredisexample.repository;")
@SpringBootApplication
public class SbredisexampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbredisexampleApplication.class, args);
	}

}
