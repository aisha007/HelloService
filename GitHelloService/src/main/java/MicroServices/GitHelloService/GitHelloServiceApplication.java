package MicroServices.GitHelloService;

package com.p1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class GitHelloServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GitHelloServiceApplication.class, args);
	}

}
