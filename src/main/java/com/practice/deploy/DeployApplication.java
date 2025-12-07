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



/*
 secrets generation - purpose
 * az ad sp create-for-rbac \
  --name "github-actions-sp" \
  --role contributor \
  --scopes /subscriptions/839d5a34-2417-4912-8c35-8f89a1b0cb46/resourceGroups/deploy-rg \
  --sdk-auth*/


/* 
 git imp commands
 
 
C:\Users\santu\Documents\springboot practice\deploy\deploy>git remote remove origin

C:\Users\santu\Documents\springboot practice\deploy\deploy>git remote add origin https://github.com/santkumrap-ui/crud

C:\Users\santu\Documents\springboot practice\deploy\deploy>*/



