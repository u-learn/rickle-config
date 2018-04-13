package com.ulearn.rickle.rconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class RConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(RConfigApplication.class, args);
	}
}
