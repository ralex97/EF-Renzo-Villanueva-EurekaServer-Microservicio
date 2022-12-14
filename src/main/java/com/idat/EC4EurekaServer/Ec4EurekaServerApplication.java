package com.idat.EC4EurekaServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class Ec4EurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ec4EurekaServerApplication.class, args);
	}

}
