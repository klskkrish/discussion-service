package com.barter.discussion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication(scanBasePackages= {"com.barter.discussion.controller"})
@EnableEurekaClient
public class DiscussionApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiscussionApplication.class, args);
	}
}
