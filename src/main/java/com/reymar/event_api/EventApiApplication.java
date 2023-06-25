package com.reymar.event_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication()
public class EventApiApplication {
	public static void main(String[] args) {
		SpringApplication.run(EventApiApplication.class, args);
	}
}
