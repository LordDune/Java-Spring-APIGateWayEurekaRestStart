package ru.ld.testCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class TestCloudApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestCloudApplication.class, args);
	}

}
