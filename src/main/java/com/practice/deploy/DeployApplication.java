package com.practice.deploy;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@ComponentScan(basePackages= {"com.practice.controller","com.practice.service","com.practice.deploy.Entity","com.practice.repository"})
@EnableJpaRepositories(basePackages="com.practice.repository")
@EntityScan(basePackages="com.practice.deploy.Entity")
public class DeployApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeployApplication.class, args);
	}

}
