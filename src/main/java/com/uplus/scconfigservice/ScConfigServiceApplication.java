package com.uplus.scconfigservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ScConfigServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScConfigServiceApplication.class, args);
	}

}
