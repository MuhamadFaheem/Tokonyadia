package com.enigmacamp.tokonyadia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class TokonyadiaApplication {

	public static void main(String[] args) {
		SpringApplication.run(TokonyadiaApplication.class, args);
	}

}